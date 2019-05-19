package service;

import model.people.Guest;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GuestCSVParser {

    public List<Guest> parseGuests(InputStream csvInputStream)throws IOException{


        byte[] buffer = new byte[5];
        int readBytes = csvInputStream.read(buffer);
        StringBuilder builder = new StringBuilder (  );

        while (readBytes > 0){
            builder.append(new String ( buffer, 0 , readBytes, "UTF-8" ));
            readBytes = csvInputStream.read (buffer);
        }

        String readContent = builder.toString ();
        String[] lines = readContent.split("\n");
        ArrayList<Guest> guests = new ArrayList<> (  );

        for (String line : lines) {
            String[] tokens = line.split ( ",");
            Guest guest = new Guest(
            );
                    guests.add(guest);

        }
        return guests;
    }


}
