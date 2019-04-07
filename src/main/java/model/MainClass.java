package model;

import person.Guest;
import person.Staff;

import java.util.ArrayList;
import java.util.List;

public class MainClass {


    public static void main(String[] args) {

        System.out.println("Welcome to our hotel! Enjoy your stay");

        Guest guest1 = new Guest ( "Jane",25,"Germany" );
        guest1.Interactions ();





        List<Room> rooms;
        rooms = new ArrayList<> ();

        List<Staff> staff = new ArrayList<> (  );

        System.out.println (rooms.size ());
        System.out.println (rooms.hashCode ());
        System.out.println (staff.size ());




            Staff Reception = new Staff ( "Annie", 25, "South", "Receptionist" );
            Staff Service = new Staff ( "Jane", 28, "East", "Room Service" );
            staff.add ( Reception );
            staff.add ( Service );
            Reception.Interactions ();
            Service.Interactions ();
            for (int i=0; i<staff.size (); i++) {
                System.out.println ( staff.get ( i ).getStaff (Reception));
            }

        Guest Guest1 = new Guest ( "james",42,"Holland" );
        System.out.println ( Guest1.getPreference ());

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

        for (int i=5; i<15; i++ ) {
            Room room1 = new Room();
            room1.setNumber(i);
            room1.setOccupied(true);
            rooms.add(room1);
            System.out.println (room1.getNumber () +" "+ room1.isOccupied ());
        }

        for (int i=15; i<34; i++) {

            Room room1 = new Room();
            room1.setCleaned ( true );
            System.out.println (room1.getNumber ()+" "+room1.isCleaned ());

        }

        for (int i=34; i<66; i++) {
            Room room2 = new Room();
            room2.setNumber(i);
            room2.setType("DOUBLE");
            room2.setOccupied(false);
            rooms.add(room2);
            System.out.println (room2.getNumber () + room2.getType ()+ room2.isOccupied () );
        }

        for (int i=34; i<66; i++) {

            Room room1 = new Room();
            room1.setCleaned ( true );
            System.out.println (room1.getNumber ()+" "+room1.isCleaned ());

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
            System.out.println (room3.getNumber () +" "+ room3.isOccupied ());
        }

        for (int i=77; i<=100; i++) {

            Room room1 = new Room();
            room1.setCleaned ( true );
            System.out.println (room1.getNumber ()+" "+room1.isCleaned ());

        }

        for (int i=77; i<=100; i++) {

            Room room1 = new Room();
            room1.setCleaned ( true );
            System.out.println (room1.getNumber ()+" "+room1.isCleaned ());

        }

              }



    }





