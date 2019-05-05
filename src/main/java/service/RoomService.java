package service;

import model.accomodation.Room;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.RoomRepository;

import java.util.stream.IntStream;

import static repository.RoomRepository.getRooms;

public class RoomService {

    private static Logger logger = Logger.getLogger ( "RoomService" );

    private RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public static int displayApartmentPrice() {
        int[] prices = {100, 200, 300};
        int largest = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > largest) {
                largest = prices[i];

            }
        }

        return largest;
    }

    private static final RoomRepository rooms = new RoomRepository ();

    public static void manageStatus() {
        int i = 1;
        while (i < 33) {
            Room room1 = new Room ();
            room1.setNumber ( i );
            room1.setType ( "SINGLE" );
            room1.setPrice ( 100 );
            rooms.add ( room1 );
            logger.log ( Level.INFO, "Room number " + room1.getNumber () + " is a  " + room1.getType () + " and it costs " + room1.getPrice () );

            i++;
        }


        for (i = 1; i < 15; i++) {
            Room room1 = new Room ();
            room1.setNumber ( i );
            room1.setOccupied ( true );
            rooms.add ( room1 );
            logger.log ( Level.INFO, "Single room number " + room1.getNumber () + " is occupied " + " (" + room1.isOccupied () + " ) " );
        }

        IntStream.range ( 15, 33 ).forEach ( n -> {
            Room room1 = new Room ();
            room1.setNumber ( n );
            room1.setCleaned ( true );
            logger.log ( Level.INFO, "Single room " + room1.getNumber () + " is not occupied and cleaned " + "(" + room1.isCleaned () + ")" );
        } );

        for (i = 34; i < 66; i++) {
            Room room2 = new Room ();
            room2.setNumber ( i );
            room2.setType ( "DOUBLE" );
            room2.setOccupied ( false );
            room2.setCleaned ( true );
            rooms.add ( room2 );
            logger.log ( Level.INFO, "Room number " + room2.getNumber () + " is " + room2.getType () + " room " + " and it is not occupied." + "(" + room2.isOccupied () + ")" );
        }

        for (i = 67; i < 100; i++) {
            Room room3 = new Room ();
            room3.setNumber ( i );
            room3.setType ( "APARTMENT" );
            RoomService.displayApartmentPrice ();
            rooms.add ( room3 );
            logger.log ( Level.INFO, "Room number " + room3.getNumber () + " is " + room3.getType () + " and it costs " + RoomService.displayApartmentPrice () + "$" );
        }

        for (i = 67; i < 77; i++) {
            Room room3 = new Room ();
            room3.setNumber ( i );
            room3.setOccupied ( true );
            rooms.add ( room3 );
            logger.log ( Level.INFO, "Room number " + room3.getNumber () + " is occupied " + "(" + room3.isOccupied () + ")" );
        }

        for (i = 77; i <= 100; i++) {

            Room room3 = new Room ();
            room3.setNumber ( i );
            room3.setCleaned ( true );
            logger.log ( Level.INFO, "Room number " + room3.getNumber () + " is cleaned " + "(" + room3.isCleaned () + ")" );

        }

    }

    @Override
    public String toString() {
        return "Hotel{" + "rooms=" + getRooms () + ", staff=" + getStaff () + ", guests" + getGuests ();
    }

    private String getGuests() {
        return null;
    }

    private String getStaff() {
        return null;
    }
}