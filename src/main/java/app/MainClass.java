package app;

import model.Room;
import person.Guest;
import person.Staff;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainClass {


    public static void main(String[] args) {

        System.out.println ( "Welcome to our hotel! Enjoy your stay" );

        List<Room> rooms;
        rooms = new ArrayList<> ();

        List<Staff> staff = new ArrayList<> ();

        Staff receptionist = new Staff ( "Annie", 25, "South", "Receptionist" );
        Staff hostess = new Staff ( "Jane", 28, "East", "Host events" );
        Staff valet = new Staff ( "Richard", 40, "North", "Follow guests and holds their purse" );
        staff.add ( receptionist );
        staff.add ( hostess );
        staff.add ( valet );
        //System.out.println ( rooms.size () );
        //System.out.println ( rooms.hashCode () );
        System.out.println ( "Total number of staff is " + staff.size () );

        for (int i = 0; i < staff.size (); i++) {
            System.out.println ( staff.get ( i ).toString () );
        }

        Guest guest1;
        guest1 = new Guest ( "James", 25, "Kansas" );
        guest1.setPreference ( "DOUBLE" );
        guest1.interactions ();
        guest1.setCheckInDate ( new Date () );

        /*try
        {
            SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-MM-dd" );
            Date checkIn = sdf.parse ( "2019-05-02" );
            Date checkOut = sdf.parse ( "2019-05-23" );
            guest1.setCheckInDate ( checkIn );
            guest1.setCheckOutDate ( checkOut );
            System.out.println ("This is my check in date " + checkIn);
            System.out.println ("This is my check out date " + checkOut);

        } catch (ParseException e) {
            e.printStackTrace ();*/


            System.out.println ( "I am " + guest1.getName () + "." + " I am from " + guest1.getAddress () + " I'd like a " + guest1.getPreference () + " room" );

            receptionist.interactions ();

            {
                int i = 1;
                while (i < 33) {
                    Room room1 = new Room ();
                    room1.setNumber ( i );
                    room1.setType ( "SINGLE" );
                    room1.setPrice ( 100 );
                    rooms.add ( room1 );
                    System.out.println ("Room number " + room1.getNumber () + " is a  " + room1.getType () + " and it costs " + room1.getPrice ());

                    i++;
                }
            }

            for (int i = 1; i < 15; i++) {
                Room room1 = new Room ();
                room1.setNumber ( i );
                room1.setOccupied ( true );
                rooms.add ( room1 );
                System.out.println ( "Single room number " + room1.getNumber () + " is occupied " + " (" + room1.isOccupied () + " ) " );
            }

            for (int i = 15; i < 33; i++) {

                Room room1 = new Room ();
                room1.setNumber ( i );
                room1.setCleaned ( true );
                System.out.println ( "Single room " + room1.getNumber () + " is not occupied and cleaned " +  "(" + room1.isCleaned () + ")" );

            }

            for (int i = 34; i < 66; i++) {
                Room room2 = new Room ();
                room2.setNumber ( i );
                room2.setType ( "DOUBLE" );
                room2.setOccupied ( false );
                room2.setCleaned ( true );
                rooms.add ( room2 );
                System.out.println ( "Room number " + room2.getNumber () +" is "+ room2.getType () + " room " + " and it is not occupied." + "(" + room2.isOccupied () + ")" );
            }

            for (int i = 67; i < 100; i++) {
                Room room3 = new Room ();
                room3.setNumber ( i );
                room3.setType ( "APARTMENT" );
                room3.displayApartmentPrice ();
                rooms.add ( room3 );
                System.out.println ("Room number " + room3.getNumber () + " is " + room3.getType () + " and it costs "+ room3.displayApartmentPrice () + "$");
            }

            for (int i = 67; i < 77; i++) {
                Room room3 = new Room ();
                room3.setNumber ( i );
                room3.setOccupied ( true );
                rooms.add ( room3 );
                System.out.println ( "Room number " + room3.getNumber () + " is occupied " + "(" + room3.isOccupied () + ")" );
            }

            for (int i = 77; i <= 100; i++) {

                Room room3 = new Room ();
                room3.setNumber ( i );
                room3.setCleaned ( true );
                System.out.println ( "Room number "+ room3.getNumber () + " is cleaned " + "("+ room3.isCleaned () + ")" );

            }

            receptionist.askGuest ();




            /*for (i = 0; i<prices.length; i++ ) {
                int smallest = prices [0];
                if (prices[i] < smallest) {
                    smallest = prices[i];
                    System.out.println ("Single room price is " + smallest );*/


                }

                }


















