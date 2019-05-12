package service;

import model.accomodation.Room;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.RoomRepository;

import java.util.Objects;

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

    public static final RoomRepository rooms = new RoomRepository ();

    public static void manageStatus() {

        for (int i = 1; i < 15; i++) {
            Room room1 = new Room ();
            room1.setNumber ( i );
            room1.setOccupied ( true );
            rooms.add ( room1 );
            logger.log ( Level.INFO, "Single room number " + room1.getNumber () + " is occupied " + " (" + room1.isOccupied () + " ) " );
        }

        for (int i = 15; i < 33; i++) {

            Room room1 = new Room ();
            room1.setNumber ( i );
            room1.setCleaned ( true );
            logger.log ( Level.INFO, "Single room " + room1.getNumber () + " is not occupied and cleaned " + "(" + room1.isCleaned () + ")" );

        }

        for (int i = 77; i <= 100; i++) {

            Room room3 = new Room ();
            room3.setNumber ( i );
            room3.setCleaned ( true );
            logger.log ( Level.INFO, "Room number " + room3.getNumber () + " is cleaned " + "(" + room3.isCleaned () + ")" );

        }

    }

    public String add(Room room) {

        int number = room.getNumber ();


        if (Objects.equals ( number, "" )) {
            return "EMPTY";
        }

        if (number == 0) {
            return "NULL OBJECT";

        }

        if (number > room.MAXIMUM_NUMBER_OF_ROOMS) {

            return "Maximum room number is " + room.MAXIMUM_NUMBER_OF_ROOMS ;

        }

        boolean responseFromRepo = roomRepository.add ( room );

        if (responseFromRepo) {

            return "Room was added successfully";
        }
        return "Room was not added successfully";
    }


    public boolean remove(Room room) {


            roomRepository.remove ( room );


            logger.log ( Level.INFO, "Room removed successfuly" );


        return true;
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