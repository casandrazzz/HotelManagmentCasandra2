package service;

import model.accomodation.Room;
import model.commercial.Hotel;
import model.enums.Responses;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.HotelRepository;

import java.util.*;

import static model.enums.Responses.NO;
import static model.enums.Responses.YES;


public class HotelService {

    private static Logger logger = Logger.getLogger("Hotel Service");

    private static List<Hotel> hotels = new ArrayList<>();

    private static HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public String validateAndAddHotels(Hotel hotel) {

        String name = hotel.getName();


        if (name == ("")) {
            return "EMPTY";
        }

        if (name == null) {
            return "NULL OBJECT";

        }

        if (name.length() > 50) {

            return "Please enter a name that has maximum 50 characters";

        }

        boolean responseFromRepo = hotelRepository.add(hotel);

        if (responseFromRepo) {

            return "Hotel was added successfully";
        }
        return "Hotel was not added successfully";
    }


    public boolean delete(Hotel hotel) {

        System.out.println("Are you sure you want to delete this item? Respond with YES or NO");
        Scanner s = new Scanner(System.in);

        String responsesStr = s.next();
        Responses responses = Responses.valueOf(responsesStr.toUpperCase());


        if (responses == YES) {
            hotelRepository.remove(hotel);


            System.out.println("Hotel removed successfuly");


        }

        if (responses == NO) {
            System.out.println("Hotel was not removed");
        }

        return true;
    }

    public static List<Room> generateRooms(int start, int end, String type) {
        List<Room> returnList = new ArrayList<Room>();
        for (int i = start; i < end; i++) {
            Room room = new Room(i, type);
            returnList.add(room);
            logger.log(Level.INFO, room.getType() + " room with number " + room.getNumber() + " created. ");
        }
        return returnList;
    }

    public static void builderPattern() {

        List<Hotel> hotels = new ArrayList<>();
        Map<UUID, List> hotelMap = new HashMap<>();



        List<Room> hotel1Rooms = new ArrayList<>(generateRooms(1, 15, "SINGLE"));
        List<Room> hotel2Rooms = new ArrayList<>(generateRooms(1, 15, "APARTMENT"));
        List<Room> hotel3Rooms = new ArrayList<>(generateRooms(2, 20, "DOUBLE"));
        List<Room> hotel4Rooms = new ArrayList<>(generateRooms(1, 15, "SINGLE"));
        List<Room> hotel5Rooms = new ArrayList<>(generateRooms(3, 18, "DOUBLE"));
        hotel1Rooms.addAll(generateRooms(16, 20, "DOUBLE"));



        Hotel hotel1 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Marriott")
                .address("NY")
                .rooms(hotel1Rooms)
                .build();
        Hotel hotel2 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Imperial")
                .address("NY")
                .rooms(hotel2Rooms)
                .build();
        Hotel hotel3 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Hilton")
                .address("Madrid")
                .rooms(hotel3Rooms)
                .build();
        Hotel hotel4 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Ana")
                .address("BV")
                .rooms(hotel4Rooms)
                .build();
        Hotel hotel5 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Phoenicia")
                .address("Milan")
                .rooms(hotel5Rooms)
                .build();

        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
        hotels.add(hotel4);
        hotels.add(hotel5);

        hotelMap.put(hotel1.getRandomID(), hotel1.rooms);
        hotelMap.put(hotel2.getRandomID(), hotel2Rooms);
        hotelMap.put(hotel3.getRandomID(), hotel3Rooms);
        hotelMap.put(hotel4.getRandomID(), hotel4Rooms);
        hotelMap.put(hotel5.getRandomID(), hotel5Rooms);



        for (Hotel hotel : hotels){
            logger.log(Level.INFO, hotel);
        }

        logger.log(Level.INFO, Arrays.asList(hotelMap));



    }





}

