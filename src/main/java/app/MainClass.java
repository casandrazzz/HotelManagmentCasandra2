package app;

import model.Casino;
import model.Games;
import model.Hotel;
import model.Gambler;
import model.Guest;
import model.Staff;
import model.Apartment;
import model.DoubleRoom;
import model.Penthouse;
import model.Room;
import repository.HotelRepository;
import service.HotelService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainClass {


    public static void main(String[] args) {

        Hotel hotel = new Hotel ();
        hotel.defineEstablishmentType ();
        hotel.displayEstablishmentLocation ();
        hotel.displayEstablishmentWorkingHours ();


        System.out.println ( Constants.WELCOME_MESSAGE );
        System.out.println ( Constants.CALL_CENTER );


        List<Room> rooms;
        rooms = new ArrayList<> ();

        List<Staff> staff = new ArrayList<> ();
        List<Guest> guests = new ArrayList<> ();

        Staff receptionist = new Staff ( "Annie", 25, "South" );
        Staff hostess = new Staff ( "Jane", 28, "East" );
        Staff valet = new Staff ( "Richard", 40, "North" );
        Staff maid = new Staff ( "Chris", 35, "West" );
        Staff accountant = new Staff ( "Fineas" );
        accountant.setJobDescription ( "Prepare balance sheets, profit and loss statements and other finacial reports" );
        receptionist.setJobDescription ( "Receive visitors at the front desk by greeting, welcoming, directing and announcing them appropiately" );
        hostess.setJobDescription ( "Present a positive first impression of the establishment's friendliness, excellent service and high standards" );
        valet.setJobDescription ( "Stand in front of the establishment, get key from the drivers, help with any luggage" );
        maid.setJobDescription ( "Clean and tidy all areas to the standard cleaniness whithin time limits" );
        staff.add ( receptionist );
        staff.add ( hostess );
        staff.add ( valet );
        staff.add ( maid );
        staff.add ( accountant );
        //System.out.println ( rooms.size () );
        //System.out.println ( rooms.hashCode () );
        System.out.println ( "Total number of staff is " + staff.size () + "." );


        for (int i = 0; i < staff.size (); i++) {
            System.out.println ( "Meet " + staff.get ( i ).toString () + "." );
        }

        Guest guest1;
        guest1 = new Guest ( "James", 25, "Kansas" );
        guest1.setPreference ( "DOUBLE" );
        guest1.interactions ();
        guest1.setCheckInDate ( new Date () );
        guest1.setNightsOfStay ( 5 );
        guests.add ( guest1 );

        DoubleRoom doubleRoom = new DoubleRoom ();
        doubleRoom.calculateCostOfStay ();
        receptionist.presentOffer ();
        System.out.println ( doubleRoom.calculateCostOfStay () );

        Guest guest2;
        guest2 = new Guest ( "Gina", 25, "Colorado" );
        guest2.setPreference ( "PENTHOUSE" );
        guest2.interactions ();
        guest2.setCheckInDate ( new Date () );
        guest2.setNightsOfStay ( 3 );
        guests.add ( guest2 );

        Apartment penthouse = new Penthouse ();
        penthouse.calculateCostOfStay ();
        System.out.println ( penthouse.getPrice () );
        receptionist.presentOffer ();
        System.out.println ( penthouse.calculateCostOfStay () );

        for (int i = 0; i < guests.size (); i++) {
            System.out.println ( guests.get ( i ).toString () + "." );
        }





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
                System.out.println ( "Room number " + room1.getNumber () + " is a  " + room1.getType () + " and it costs " + room1.getPrice () );

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
            System.out.println ( "Single room " + room1.getNumber () + " is not occupied and cleaned " + "(" + room1.isCleaned () + ")" );

        }

        for (int i = 34; i < 66; i++) {
            Room room2 = new Room ();
            room2.setNumber ( i );
            room2.setType ( "DOUBLE" );
            room2.setOccupied ( false );
            room2.setCleaned ( true );
            rooms.add ( room2 );
            System.out.println ( "Room number " + room2.getNumber () + " is " + room2.getType () + " room " + " and it is not occupied." + "(" + room2.isOccupied () + ")" );
        }

        for (int i = 67; i < 100; i++) {
            Room room3 = new Room ();
            room3.setNumber ( i );
            room3.setType ( "APARTMENT" );
            room3.displayApartmentPrice ();
            rooms.add ( room3 );
            System.out.println ( "Room number " + room3.getNumber () + " is " + room3.getType () + " and it costs " + room3.displayApartmentPrice () + "$" );
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
            System.out.println ( "Room number " + room3.getNumber () + " is cleaned " + "(" + room3.isCleaned () + ")" );

        }

        receptionist.askGuest ();

        Casino casino = new Casino ( Games.SLOT_MACHINE );
        casino.defineEstablishmentType ();
        casino.displayEstablishmentLocation ();
        casino.displayEstablishmentWorkingHours ();
        casino.presentGames ();

        Gambler gambler = new Gambler ( "Bruce", 28, "Florida", 200 );
        gambler.checkMinimumAge ();

        Hotel hotel1 = new Hotel ();
        Hotel hotel2 = new Hotel ();




        HotelRepository hotelRepository = new HotelRepository ();
        HotelService hotelService = new HotelService ( hotelRepository );
        hotelService.validateAndAddHotels ( hotel1 );
        hotelService.validateAndAddHotels ( hotel2 );
        hotel1.setName ( "Majestic" );
        hotel2.setName ( "a1a2a3a4a5a6a7a8a9a1a2a3a4a5a6a7a8a9a1a2a3a4a5a6a7a8a9a1a2a3a4a5a6a7a8a9" );
        System.out.println (hotel1.getName () + hotelService.validateAndAddHotels ( hotel1 ));
        System.out.println (hotel2.getName () + hotelService.validateAndAddHotels ( hotel2 ));
        //hotelService.delete ( hotel2 );
        System.out.println (hotel2.getName ()+hotelService.delete ( hotel2 ));





            /*for (i = 0; i<prices.length; i++ ) {
                int smallest = prices [0];
                if (prices[i] < smallest) {
                    smallest = prices[i];
                    System.out.println ("Single room price is " + smallest );*/


    }

}


















