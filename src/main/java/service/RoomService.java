package service;

import model.accomodation.Room;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.RoomRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static repository.RoomRepository.getRooms;

public class RoomService {

    private static Logger logger = Logger.getLogger("RoomService");
    private RoomRepository roomRepository;

    private List<Room> rooms = new ArrayList<>();


    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public static void displayRooms() {

        List<Room> rooms = new ArrayList<>();

        IntStream.range(1, 33).forEach(n -> {
            Room room1 = new Room();
            room1.setNumber(n);
            room1.setType("SINGLE");
            room1.setPrice(100);
            rooms.add(room1);
            logger.log(Level.INFO, room1.getNumber() + " is a  " + room1.getType() + " , Price: " + room1.getPrice());

        });
        IntStream.range(34, 66).forEach(n -> {
            Room room2 = new Room();
            room2.setNumber(n);
            room2.setType("DOUBLE");
            rooms.add(room2);
            logger.log(Level.INFO, room2.getNumber() + " is " + room2.getType() + ", Price: " + room2.getPrice());

        });

        IntStream.range(67, 100).forEach(n -> {
            Room room3 = new Room();
            room3.setNumber(n);
            room3.setType("APARTMENT");
            rooms.add(room3);
            logger.log(Level.INFO, room3.getNumber() + " is " + room3.getType() + " , Price: " + RoomService.displayApartmentPrice() + "$");

        });



    }

    public static void sortRooms() {
        List<Room> rooms = new ArrayList<>();

        Room room1 = new Room();
        room1.setNumber(1);
        room1.setType("DOUBLE");
        rooms.add(0, room1);

        Room room2 = new Room();
        room2.setNumber(1);
        room2.setType("DOUBLE");
        rooms.add(1, room2);

        Room room3 = new Room();
        room3.setNumber(3);
        room3.setType("SINGLE");
        rooms.add(2, room3);

        Room room4 = new Room();
        room4.setNumber(4);
        room4.setType("SINGLE");
        rooms.add(3, room4);

        Room room5 = new Room();
        room5.setNumber(1);
        room5.setType("DOUBLE");
        rooms.add(4, room5);

        Room room6 = new Room();
        room6.setNumber(1);
        room6.setType("DOUBLE");
        rooms.add(5, room6);

        Room room7 = new Room();
        room7.setNumber(7);
        room7.setType("APARTMENT");
        rooms.add(6, room7);

        Room room8 = new Room();
        room8.setNumber(1);
        room8.setType("SINGLE");
        rooms.add(7, room8);

        Room room9 = new Room();
        room9.setNumber(9);
        room9.setType("APARTMENT");
        rooms.add(8, room9);

        Room room10 = new Room();
        room10.setNumber(10);
        room10.setType("APARTMENT");
        rooms.add(9, room10);

        logger.log(Level.INFO, "Initial list: " + rooms.size());

        System.out.println("Initial list: ");
        for (Room room : rooms) {
            logger.log(Level.INFO,room);
        }

       rooms.forEach(room -> System.out.println(room.getType()));
        Comparator<Room> sortByType = Comparator.comparing(Room::getType);


        rooms.sort(sortByType);
        System.out.println("Sorted List: ");
        for (Room room : rooms){
            logger.log(Level.INFO, room);
        }

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


    public static void manageStatus() {

        List<Room> roomsStatus = new ArrayList<>();

        for (int i = 1; i < 15; i++) {
            Room room1 = new Room();
            room1.setNumber(i);
            room1.setOccupied(true);
            roomsStatus.add(0, room1);
            logger.log(Level.INFO, "Single room number " + room1.getNumber() + " is occupied " + " (" + room1.isOccupied() + " ) ");
        }

        for (int i = 15; i < 33; i++) {

            Room room2 = new Room();
            room2.setNumber(i);
            room2.setCleaned(true);
            roomsStatus.add(1, room2);
            logger.log(Level.INFO, "Single room " + room2.getNumber() + " is not occupied and cleaned " + "(" + room2.isCleaned() + ")");

        }

        for (int i = 77; i <= 100; i++) {

            Room room3 = new Room();
            room3.setNumber(i);
            room3.setCleaned(true);
            roomsStatus.add(3, room3);
            logger.log(Level.INFO, "Room number " + room3.getNumber() + " is cleaned " + "(" + room3.isCleaned() + ")");
            logger.log(Level.INFO, roomsStatus.size());

        }

    }

    public String add(Room room) {

        int number = room.getNumber();


        if (number == 0) {
            return "NULL OBJECT";

        }

        if (number > room.MAXIMUM_NUMBER_OF_ROOMS) {

            return "Maximum room number is " + room.MAXIMUM_NUMBER_OF_ROOMS;

        }

        boolean responseFromRepo = roomRepository.add(room);

        if (responseFromRepo) {

            return "Room was added successfully";
        }
        return "Room was not added successfully";
    }


    public boolean remove(Room room) {


        roomRepository.remove(room);


        logger.log(Level.INFO, "Room removed successfuly");


        return true;
    }

    @Override
    public String toString() {
        return "Hotel{" + "rooms=" + getRooms() + ", staff=" + getStaff() + ", guests" + getGuests();
    }

    private String getGuests() {
        return null;
    }

    private String getStaff() {
        return null;
    }
}