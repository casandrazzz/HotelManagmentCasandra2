package app;

import model.accomodation.Apartment;
import model.accomodation.DoubleRoom;
import model.accomodation.Penthouse;
import model.commercial.Casino;
import model.commercial.Hotel;
import model.enums.Games;
import model.people.Gambler;
import model.people.Guest;
import model.people.InputValidation;
import model.people.Staff;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.HotelRepository;
import service.HotelService;
import service.StaffService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainClass {
    private static Logger logger = Logger.getLogger ( "Main" );

    public static void main(String[] args) throws IOException, InputValidation {

        logger.info ( "INFO" );


        Hotel hotel = new Hotel ();
        hotel.defineEstablishmentType ();
        hotel.displayEstablishmentLocation ();
        hotel.displayEstablishmentWorkingHours ();


        logger.log ( Level.INFO, Constants.WELCOME_MESSAGE );
        logger.log ( Level.INFO, Constants.CALL_CENTER );


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
        logger.log ( Level.INFO, "Total number of staff is " + staff.size () + "." );
        logger.log ( Level.INFO, "Meet " + staff.toString () + "." );
        StaffService.interactions();
        StaffService.presentOffer ();


        Guest guest1;
        guest1 = new Guest ( "James", 25, "Kansas" );
        guest1.setPreference ( "DOUBLE" );
        guest1.interactions ();
        guest1.setCheckInDate ( new Date () );
        guest1.setNightsOfStay ( 5 );
        guests.add ( guest1 );

        DoubleRoom doubleRoom = new DoubleRoom ();
        doubleRoom.calculateCost ();
        logger.log ( Level.INFO, doubleRoom.calculateCost () );

        Guest guest2;
        guest2 = new Guest ( "Gina", 25, "Colorado" );
        guest2.setPreference ( "PENTHOUSE" );
        guest2.interactions ();
        guest2.setCheckInDate ( new Date () );
        guest2.setNightsOfStay ( 3 );
        guests.add ( guest2 );

        Apartment penthouse = new Penthouse ();
        Apartment.calculateCost ();
        logger.log ( Level.INFO, penthouse.getPrice () );
        logger.log ( Level.INFO, penthouse.calculateCost () );

        for (int i = 0; i < guests.size (); i++) {
            logger.log ( Level.INFO, guests.get ( i ).toString () + "." );
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


        logger.log ( Level.INFO, "I am " + guest1.getName () + "." + " I am from " + guest1.getAddress () + " I'd like a " + guest1.getPreference () + " room" );



       /* {
            int i = 1;
            while (i < 33) {
                Room room1 = new Room ();
                room1.setNumber ( i );
                room1.setType ( "SINGLE" );
                room1.setPrice ( 100 );
                rooms.add ( room1 );
                logger.log (Level.INFO, "Room number " + room1.getNumber () + " is a  " + room1.getType () + " and it costs " + room1.getPrice () );

                i++;
            }
        }

        for (int i = 1; i < 15; i++) {
            Room room1 = new Room ();
            room1.setNumber ( i );
            room1.setOccupied ( true );
            rooms.add ( room1 );
            logger.log (Level.INFO, "Single room number " + room1.getNumber () + " is occupied " + " (" + room1.isOccupied () + " ) " );
        }

        for (int i = 15; i < 33; i++) {

            Room room1 = new Room ();
            room1.setNumber ( i );
            room1.setCleaned ( true );
            logger.log (Level.INFO, "Single room " + room1.getNumber () + " is not occupied and cleaned " + "(" + room1.isCleaned () + ")" );

        }

        for (int i = 34; i < 66; i++) {
            Room room2 = new Room ();
            room2.setNumber ( i );
            room2.setType ( "DOUBLE" );
            room2.setOccupied ( false );
            room2.setCleaned ( true );
            rooms.add ( room2 );
            logger.log (Level.INFO, "Room number " + room2.getNumber () + " is " + room2.getType () + " room " + " and it is not occupied." + "(" + room2.isOccupied () + ")" );
        }

        for (int i = 67; i < 100; i++) {
            Room room3 = new Room ();
            room3.setNumber ( i );
            room3.setType ( "APARTMENT" );
            room3.displayApartmentPrice ();
            rooms.add ( room3 );
            logger.log (Level.INFO, "Room number " + room3.getNumber () + " is " + room3.getType () + " and it costs " + room3.displayApartmentPrice () + "$" );
        }

        for (int i = 67; i < 77; i++) {
            Room room3 = new Room ();
            room3.setNumber ( i );
            room3.setOccupied ( true );
            rooms.add ( room3 );
            logger.log (Level.INFO, "Room number " + room3.getNumber () + " is occupied " + "(" + room3.isOccupied () + ")" );
        }

        for (int i = 77; i <= 100; i++) {

            Room room3 = new Room ();
            room3.setNumber ( i );
            room3.setCleaned ( true );
            logger.log (Level.INFO, "Room number " + room3.getNumber () + " is cleaned " + "(" + room3.isCleaned () + ")" );

        }*/

        //   receptionist.askGuest ();


        Casino casino = new Casino ( Games.SLOT_MACHINE );
        casino.defineEstablishmentType ();
        casino.displayEstablishmentLocation ();
        casino.displayEstablishmentWorkingHours ();
        casino.presentGames ();
        casino.displayLanguage ();

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
        logger.log ( Level.INFO, hotel1.getName () + hotelService.validateAndAddHotels ( hotel1 ) );
        logger.log ( Level.INFO, hotel2.getName () + hotelService.validateAndAddHotels ( hotel2 ) );
        //hotelService.delete ( hotel2 );
        logger.log ( Level.INFO, hotel2.getName () + hotelService.delete ( hotel2 ) );





            /*for (i = 0; i<prices.length; i++ ) {
                int smallest = prices [0];
                if (prices[i] < smallest) {
                    smallest = prices[i];
                    System.out.println ("Single room price is " + smallest );*/


    }

}


















