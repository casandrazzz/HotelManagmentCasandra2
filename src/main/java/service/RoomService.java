/*
  Contains add/remove methods for rooms
  Contains a List
  Contains a method for displaying rooms (needs improvement)
  Contains a method for sorting the rooms ascending, by name
  TODO confirmSelection(): Scanner for user input of selectedRoom and print a confirmation of the selected room for YES, Null, NO, with the chance to select again
 */

package service;

import model.accomodation.Room;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.RoomRepository;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RoomService {

    private static final Logger logger = Logger.getLogger("RoomService");
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public static void createRooms() {

        //noinspection MismatchedQueryAndUpdateOfCollection
        Vector<Room> hotelRooms = new Vector<>();

        IntStream.range(1, 33).forEach(n -> {
            Room room1 = new Room(n, "SINGLE");
            //room1.setPrice(100);
            hotelRooms.add(room1);
            logger.log(Level.INFO, room1.getNumber() + " is a  " + room1.getType() + " , Price: " + room1.getPrice());

        });
        IntStream.range(34, 66).forEach(n -> {
            Room room2 = new Room(n, "DOUBLE");
            hotelRooms.add(room2);
            logger.log(Level.INFO, room2.getNumber() + " is " + room2.getType() + ", Price: " + room2.getPrice());

        });

        IntStream.range(67, 100).forEach(n -> {
            Room room3 = new Room(n, "APARTMENT");
            hotelRooms.add(room3);
            logger.log(Level.INFO, room3.getNumber() + " is " + room3.getType());

        });


    }

    public static void sortRooms() {
        List<Room> rooms = new ArrayList<>();

        Room room1 = new Room(1, "DOUBLE");
        rooms.add(0, room1);

        Room room2 = new Room(1, "DOUBLE");
        rooms.add(1, room2);

        Room room3 = new Room(3, "SINGLE");
        rooms.add(2, room3);

        Room room4 = new Room(4, "SINGLE");
        rooms.add(3, room4);

        Room room5 = new Room(1, "DOUBLE");
        rooms.add(4, room5);

        Room room6 = new Room(1, "DOUBLE");
        rooms.add(5, room6);

        Room room7 = new Room(7, "APARTMENT");
        rooms.add(6, room7);

        Room room8 = new Room(1, "SINGLE");
        rooms.add(7, room8);

        Room room9 = new Room(9, "APARTMENT");
        rooms.add(8, room9);

        Room room10 = new Room(10, "APARTMENT");
        rooms.add(9, room10);

        logger.log(Level.INFO, "Initial list: " + rooms.size());

        System.out.println("Initial list: ");
        for (Room room : rooms) {
            logger.log(Level.INFO, room);
        }

        rooms.forEach(room -> System.out.println(room.getType()));
        Comparator<Room> sortByType = Comparator.comparing(Room::getType);

        List<Room> streamToSortList = rooms.stream()
                .sorted(sortByType)
                .collect(Collectors.toList());
        streamToSortList.forEach(System.out::println);


        //     rooms.sort(sortByType);
        //     System.out.println("Sorted List: ");
        //     for (Room room : rooms) {
        //         logger.log(Level.INFO, room);
        //     }
    }


    public static void displayApartmentPrice() {
        Optional<Integer> apartmentPrice = Stream.of(100, 200, 300)
                .max(Comparator.comparing(Integer::valueOf));
        apartmentPrice.ifPresent(integer -> System.out.println(apartmentPrice.get()));


    }

    public static void confirmSelection() {
        Optional<String> selectedRoom = Optional.of("Double");
        String option1 = "Yes";
        String option2 = null;
        String option3 = "No";

        logger.log(Level.INFO, "Selected Room is" + selectedRoom);
        logger.log(Level.INFO, Optional.of(option1));
        logger.log(Level.INFO, Optional.empty());
        logger.log(Level.INFO, Optional.of(option3));

        List<String> options = Arrays.asList("Yes", null);
        String validOption = options.stream()
                .reduce("", (o1, o2) -> o1.contains("Y") ? o1 : o2);

        logger.log(Level.INFO, validOption);

    }


    public String add(Room room) {

        int number = room.getNumber();


        if (number == 0) {
            return "NULL OBJECT";

        }

        if (number > 500) {

            return "Maximum room number is " + 500;

        }

        boolean responseFromRepo = roomRepository.add(room);

        if (responseFromRepo) {

            return "Room was added successfully";
        }
        return "Room was not added successfully";
    }


    public boolean remove(Room room) {


        roomRepository.remove(room);


        logger.log(Level.INFO, "Room removed successfully");


        return true;
    }

    @Override
    public String toString() {
        return "Room{" + "rooms=" + roomRepository.getRooms();
    }
}