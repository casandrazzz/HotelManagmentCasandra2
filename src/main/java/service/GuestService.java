package service;

import lombok.ToString;
import model.enums.Responses;
import model.people.Guest;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.GuestRepository;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static model.enums.Responses.NO;
import static model.enums.Responses.YES;

@ToString(callSuper = true)


public class GuestService {
    private static Logger logger = Logger.getLogger ( "GuestService" );

    private GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public static void readRules() {
        Charset charset = Charset.forName ( "UTF8" );
        Path path = Paths.get ( "Rules.txt" );
        try (BufferedReader reader = Files.newBufferedReader ( path, charset )) {
            String line;

            while ((line = reader.readLine ()) != null) {
                logger.log ( Level.INFO, line );
            }
        } catch (IOException e) {
            e.printStackTrace ();


        }
    }

    public static void readLoyaltyStatus() throws IOException, ClassNotFoundException {
        String fileName = "guests.csv";
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream ( fileName );


            GuestCSVParser parser = new GuestCSVParser ();
            List<Guest> guests = parser.parseGuests ( inputStream );
            logger.log ( Level.INFO, guests.get ( 2 ) );

            GuestCSVReader reader = new GuestCSVReader ();

            String content;
            content = "Gloria James, 35, Holland, GOLD\n" +
                    "Michael Lynn, 42, UK, SILVER";

            guests = reader.readGuests ( new FileReader ( fileName ) );
            Guest gloria = guests.get ( 1 );
            logger.log ( Level.INFO, gloria );

            try (ObjectOutputStream oos = new ObjectOutputStream ( new FileOutputStream ( "Gloria.obj" ) )) {
                oos.writeObject ( gloria );
                oos.flush ();

            }

            Object o;
            try (ObjectInputStream ois = new ObjectInputStream ( new FileInputStream ( "Gloria.obj" ) )) {
                o = ois.readObject ();
            }
            Guest gloria2 = (Guest) o;
            logger.log ( Level.INFO, gloria2 );

        } finally {
            if (inputStream != null) {
                inputStream.close ();
            }
        }
    }

    public String add(Guest guest) {

        String name = guest.getName ();


        if (Objects.equals ( name, "" )) {
            return "EMPTY";
        }

        if (name == null) {
            return "NULL OBJECT";

        }

        if (name.length () > 50) {

            return "Please enter a name that has maximum 50 characters";

        }

        boolean responseFromRepo = guestRepository.add ( guest );

        if (responseFromRepo) {

            return "Guest was added successfully";
        }
        return "Guest was not added successfully";
    }


    public boolean remove(Guest guest) {

        logger.log ( Level.INFO, "Are you sure you want to delete this item? Respond with YES or NO" );
        Scanner s = new Scanner ( System.in );

        String responsesStr = s.next ();
        Responses responses = Responses.valueOf ( responsesStr.toUpperCase () );


        if (responses == YES) {
            guestRepository.remove ( guest );


            logger.log ( Level.INFO, "Guest removed successfuly" );


        }

        if (responses == NO) {
            logger.log ( Level.INFO, "Guest was not removed" );
        }

        return true;
    }

    public static int computePeriod(Date checkIn, Date checkOut) {


        long days = checkOut.getTime () - checkIn.getTime ();
        return (int) days / (1000 * 60 * 60 * 24);

    }




    }
