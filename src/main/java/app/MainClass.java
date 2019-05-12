package app;

import model.accomodation.Apartment;
import model.accomodation.DoubleRoom;
import model.accomodation.Penthouse;
import model.accomodation.Room;
import model.commercial.Casino;
import model.commercial.Hotel;
import model.enums.Games;
import model.people.Gambler;
import model.people.Guest;
import model.people.Staff;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.HotelRepository;
import service.GuestService;
import service.HotelService;
import service.RoomService;
import service.StaffService;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

import static model.accomodation.DoubleRoom.calculateCost;
import static service.RoomService.rooms;


@SuppressWarnings("ResultOfMethodCallIgnored")
public class MainClass {
    private static Logger logger = Logger.getLogger ( "Main" );

    public static void main(String[] args) throws IOException, ClassNotFoundException {

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
        Staff accountant = new Staff ( "Fineas", 25, "Madrid" );
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
        StaffService.interactions ();
        StaffService.presentOffer ();


        Guest guest1;


        guest1 = new Guest ( "James", 25, "Kansas" );
        guest1.setPreference ( "DOUBLE" );
        guest1.interactions ();
        guest1.setCheckInDate ( new Date () );
        guest1.setReasonForStay ( "Business" );
        guests.add ( guest1 );


        new DoubleRoom ();
        calculateCost ();
        logger.log ( Level.INFO, calculateCost () );

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
        logger.log ( Level.INFO, Apartment.calculateCost () );

        for (int i = 0; i < guests.size (); i++) {
            logger.log ( Level.INFO, guests.get ( i ).toString () + "." );
        }


        logger.log ( Level.INFO, "I am " + guest1.getName () + "." + " I am from " + guest1.getAddress () + " I'd like a " + guest1.getPreference () + " room" );

        IntStream.range ( 1, 33 ).forEach ( n -> {
            Room room1 = new Room ();
            room1.setNumber ( n );
            room1.setType ( "SINGLE" );
            room1.setPrice ( 100 );
            rooms.add ( room1 );
            logger.log ( Level.INFO, room1.getNumber () + " is a  " + room1.getType () + " , Price: " + room1.getPrice () );

        } );
        IntStream.range ( 34, 66 ).forEach ( n -> {
            Room room2 = new Room ();
            room2.setNumber ( n );
            room2.setType ( "DOUBLE" );
            rooms.add ( room2 );
            logger.log ( Level.INFO, room2.getNumber () + " is " + room2.getType () + ", Price: " + room2.getPrice () );

        } );

        IntStream.range ( 67, 100 ).forEach ( n -> {
            Room room3 = new Room ();
            room3.setNumber ( n );
            room3.setType ( "APARTMENT" );
            RoomService.displayApartmentPrice ();
            rooms.add ( room3 );
            logger.log ( Level.INFO, room3.getNumber () + " is " + room3.getType () + " , Price: " + RoomService.displayApartmentPrice () + "$" );

        } );

        RoomService.manageStatus ();
        rooms.toString ();
        rooms.listRooms ();


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
        logger.log ( Level.INFO, hotel2.getName () + hotelService.delete ( hotel2 ) );
        guests.size ();

        GuestService.readLoyaltyStatus ();
        GuestService.readRules ();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-MM-dd" );
            Date checkIn = sdf.parse ( "2019-05-02" );
            Date checkOut = sdf.parse ( "2019-05-23" );
            guest1.setCheckInDate ( checkIn );
            guest1.setCheckOutDate ( checkOut );
            logger.log ( Level.INFO, "This is my check in date " + checkIn );
            logger.log ( Level.INFO, "This is my check out date " + checkOut );
        } catch (ParseException e) {
            logger.log ( Level.ERROR, e );


        }

    }
}



















