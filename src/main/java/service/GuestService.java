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
import java.time.LocalDate;
import java.util.*;

import static model.enums.Responses.NO;
import static model.enums.Responses.YES;

@ToString(callSuper = true)


public class GuestService {
    private static final Logger logger = Logger.getLogger("Guest Service");

    private final GuestRepository guestRepository;
    private static final Set<Guest> guestsSet = new HashSet<>();


    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public static void readRules() {
        Charset charset = Charset.forName("UTF8");
        Path path = Paths.get("Rules.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            String line;

            while ((line = reader.readLine()) != null) {
                logger.log(Level.INFO, line);
            }
        } catch (IOException e) {
            e.printStackTrace();


        }
    }

    public static void readLoyaltyStatus() throws IOException, ClassNotFoundException {
        String fileName = "guests.csv";

        try (InputStream inputStream = new FileInputStream(fileName)) {


            GuestCSVParser parser = new GuestCSVParser();
            List<Guest> guests = parser.parseGuests(inputStream);
            logger.log(Level.INFO, guests.get(2));

            GuestCSVReader reader = new GuestCSVReader();

            String content;

            guests = reader.readGuests(new FileReader(fileName));
            Guest gloria = guests.get(1);
            logger.log(Level.INFO, gloria);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Gloria.obj"))) {
                oos.writeObject(gloria);
                oos.flush();

            } catch (NotSerializableException e) {
                logger.log(Level.ERROR, "Not Serializable Exception");

            } catch (WriteAbortedException e) {
                logger.log(Level.ERROR, "Write Aborted Exception");
            }

            Object o;
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Gloria.obj"))) {
                o = ois.readObject();
                Guest gloria2 = (Guest) o;
                logger.log(Level.INFO, gloria2);
            } catch (WriteAbortedException e) {
                logger.log(Level.ERROR, "Write aborted exception");
            }


        }
    }

    public String add(Guest guest) {

        String name = guest.getName();


        if (Objects.equals(name, "")) {
            return "EMPTY";
        }

        if (name == null) {
            return "NULL OBJECT";

        }

        if (name.length() > 50) {

            return "Please enter a name that has maximum 50 characters";

        }

        boolean responseFromRepo = guestRepository.add(guest);

        if (responseFromRepo) {

            return "Guest was added successfully";
        }
        return "Guest was not added successfully";
    }


    public boolean remove(Guest guest) {

        logger.log(Level.INFO, "Are you sure you want to delete this item? Respond with YES or NO");
        Scanner s = new Scanner(System.in);

        String responsesStr = s.next();
        Responses responses = Responses.valueOf(responsesStr.toUpperCase());


        if (responses == YES) {
            guestRepository.remove(guest);


            logger.log(Level.INFO, "Guest removed successfully");


        }

        if (responses == NO) {
            logger.log(Level.INFO, "Guest was not removed");
        }

        return true;
    }

    public static int computePeriod(Date checkIn, Date checkOut) {


        long nightsOfStay = checkOut.getTime() - checkIn.getTime();
        return (int) nightsOfStay / (1000 * 60 * 60 * 24);

    }


     public static void builderPattern() {


        Guest guest1 = new Guest.Builder("Robert", 25, "NY")
                .id(1)
                .stays(1)
                .checkIn(LocalDate.of(2019,8,20))
                .build();
        Guest guest2 = new Guest.Builder("Robert", 25, "NY")
                .id(1)
                .stays(1)
                .checkIn(LocalDate.of(2019,9,20))
                .build();
        Guest guest3 = new Guest.Builder("James", 25, "NY")
                .id(2)
                .name("James")
                .checkIn(LocalDate.of(2019,10,20))
                .stays(2)
                .build();
        Guest guest4 = new Guest.Builder("James", 25, "NY")
                .id(2)
                .name("James")
                .checkIn(LocalDate.of(2019,11,20))
                .stays(2)
                .build();
        Guest guest5 = new Guest.Builder("Leona", 25, "NY")
                .id(5)
                .name("Leona")
                .checkIn(LocalDate.of(2019,7,20))
                .stays(5)
                .build();
        Guest guest6 = new Guest.Builder("Ana", 25, "NY")
                .id(6)
                .name("Ana")
                .checkIn(LocalDate.of(2019,8,21))
                .stays(6)
                .build();
        Guest guest7 = new Guest.Builder("Laura", 25, "NY")
                .id(7)
                .name("Laura")
                .checkIn(LocalDate.of(2019,6,20))
                .stays(7)
                .build();
        Guest guest8 = new Guest.Builder("Katrine", 25, "NY")
                .id(8)
                .name("Katrine")
                .checkIn(LocalDate.of(2019,5,20))
                .stays(8)
                .build();
        Guest guest9 = new Guest.Builder("Chloe", 25, "NY")
                .id(9)
                .name("Chloe")
                .stays(9)
                .build();
        Guest guest10 = new Guest.Builder("Hailey", 25, "NY")
                .id(10)
                .name("Hailey")
                .stays(10)
                .build();
        Guest guest11 = new Guest.Builder("Pearl", 25, "NY")
                .id(11)
                .name("Pearl")
                .stays(11)
                .build();
        Guest guest12 = new Guest.Builder("Ryan", 25, "NY")
                .id(1)
                .name("Ryan")
                .stays(12)
                .build();
        Guest guest13 = new Guest.Builder("Victoria", 25, "NY")
                .id(13)
                .name("Victoria")
                .stays(13)
                .build();
        Guest guest14 = new Guest.Builder("Jason", 25, "NY")
                .id(14)
                .name("Jason")
                .stays(14)
                .build();
        Guest guest15 = new Guest.Builder("Mara", 25, "NY")
                .id(15)
                .name("Mara")
                .stays(15)
                .build();
        Guest guest16 = new Guest.Builder("Martin", 25, "NY")
                .id(16)
                .name("Martin")
                .stays(16)
                .build();
        Guest guest17 = new Guest.Builder("Lewis", 25, "NY")
                .id(17)
                .name("lewis")
                .stays(17)
                .build();
        Guest guest18 = new Guest.Builder("Hawk", 25, "NY")
                .id(18)
                .name("Hawk")
                .stays(18)
                .build();
        Guest guest19 = new Guest.Builder("Richard", 25, "NY")
                .id(19)
                .name("Richard")
                .stays(19)
                .build();
        Guest guest20 = new Guest.Builder("Frank", 25, "NY")
                .id(20)
                .name("Frank")
                .stays(20)
                .build();


        addGuestsToSet(guest1, guest2, guest3, guest4, guest5, guest6, guest7, guest8, guest9, guest10);
        addGuestsToSet(guest11, guest12, guest13, guest14, guest15, guest16, guest17, guest18, guest19, guest20);
        logger.log(Level.INFO, "Guests added with builder are" + guestsSet.toString());
        logger.log(Level.INFO, guestsSet.size());
        logger.log(Level.INFO,"Checking equality between guest1 and guest2 = " + guest11.equals(guest2));
        logger.log(Level.INFO,"HashSet contains Robert = " + guestsSet.contains(guest1));


    }

    private static void addGuestsToSet(Guest guest1, Guest guest2, Guest guest3, Guest guest4, Guest guest5, Guest guest6, Guest guest7, Guest guest8, Guest guest9, Guest guest10) {
        guestsSet.add(guest1);
        guestsSet.add(guest2);
        guestsSet.add(guest3);
        guestsSet.add(guest4);
        guestsSet.add(guest5);
        guestsSet.add(guest6);
        guestsSet.add(guest7);
        guestsSet.add(guest8);
        guestsSet.add(guest9);
        guestsSet.add(guest10);
    }




    }











