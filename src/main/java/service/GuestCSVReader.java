package service;

import model.people.Guest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class GuestCSVReader {
    public List<Guest> readGuests(Reader reader) throws IOException{
        ArrayList<Guest> guests = new ArrayList<> (  );

        BufferedReader bufReader = new BufferedReader ( reader );

        String line = bufReader.readLine ();
        while (line != null){
            String[] tokens = line.split ( "," );
            Guest guest;
            guest = new Guest (
            );
            guests.add ( guest );
            line = bufReader.readLine ();


        }

        return guests;
    }
}
