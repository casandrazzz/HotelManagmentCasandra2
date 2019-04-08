package HotelApp;

import model.Hotel;
import model.Room;
import person.Guest;
import person.Staff;

import java.util.ArrayList;
import java.util.List;

public class MainClass {


    public static void main(String[] args) {

        System.out.println("Welcome to our hotel! Enjoy your stay");

        List<Room> rooms;
        rooms = new ArrayList<> ();

        List<Staff> staff = new ArrayList<> (  );

        System.out.println (rooms.size ());
        System.out.println (rooms.hashCode ());
        System.out.println (staff.size ());




        Staff reception = new Staff ( "Annie", 25, "South", "Receptionist" );
        Staff service = new Staff ( "Jane", 28, "East", "Room Service" );
        staff.add ( reception );
        staff.add ( service );



            for (int i=0; i<staff.size (); i++) {
                System.out.println ( staff.get ( i ).getStaff (reception));
            }



        Guest guest1;
        guest1 = new Guest ( "J",25, "K" );
        guest1.setPreference ("DOUBLE");
        guest1.setName ( "James" );
        guest1.setAddress ( "Kansas" );
        guest1.setAge ( 25 );
        guest1.Interactions ();

        System.out.println ("I am " + guest1.getName()  + "."+ " I am from " + guest1.getAddress ()+ " I'd like a " + guest1.getPreference () + " room");

        service.Interactions ();

        {
            int i=1;
            while (i<33) {
                Room room1 = new Room();
                room1.setNumber(i);
                room1.setType("SINGLE");
                rooms.add(room1);
                System.out.println (room1.getNumber () +" "+ room1.getType ());

                i++;
            }
        }

        for (int i=1; i<15; i++ ) {
            Room room1 = new Room();
            room1.setNumber(i);
            room1.setOccupied(true);
            rooms.add(room1);
            System.out.println (room1.getNumber () +" "+ room1.isOccupied ()+ " Room is not free. ");
        }

        for (int i=15; i<33; i++) {

            Room room1 = new Room();
            room1.setNumber ( i );
            room1.setCleaned ( true );
            System.out.println (room1.getNumber ()+"  "+room1.isCleaned () + " Room is cleaned. ");

        }

        for (int i=34; i<66; i++) {
            Room room2 = new Room();
            room2.setNumber(i);
            room2.setType("DOUBLE");
            room2.setOccupied(false);
            rooms.add(room2);
            System.out.println (room2.getNumber () + room2.getType ()+ room2.isOccupied () + " Room is free." );
        }

        for (int i=34; i<66; i++) {

            Room room2 = new Room();
            room2.setNumber ( i );
            room2.setCleaned ( true );
            System.out.println (room2.getNumber ()+" "+room2.isCleaned ()+ " Room is cleaned.");

        }


        for (int i=67; i<100; i++) {
            Room room3 = new Room();
            room3.setNumber(i);
            room3.setType("APARTMENT");
            rooms.add(room3);
            System.out.println (room3.getNumber () +" "+ room3.getType ());
        }

        for (int i=67; i<77; i++) {
            Room room3 = new Room();
            room3.setNumber(i);
            room3.setOccupied(true);
            rooms.add(room3);
            System.out.println (room3.getNumber () +" "+ room3.isOccupied () + " Room is not free");
        }

        for (int i=77; i<=100; i++) {

            Room room3 = new Room();
            room3.setNumber ( i );
            room3.setCleaned ( true );
            System.out.println (room3.getNumber ()+" "+room3.isCleaned () + " Room is cleaned");

        }

        int [] prices = {100,200,300,1000};
        int largest = prices [0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > largest) {
                largest = prices[i];
                System.out.println ("We also have the VIP room" + largest);
            }
        }
        service.Pay ();


    }
}











