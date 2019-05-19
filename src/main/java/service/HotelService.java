package service;

import model.commercial.Hotel;
import model.enums.Responses;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.HotelRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

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

    public static void builderPattern() {

        List<Hotel> hotels = new ArrayList<>();


        Hotel hotel1 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Marriott")
                .address("NY")
                .build();
        Hotel hotel2 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Imperial")
                .address("NY")
                .build();
        Hotel hotel3 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Hilton")
                .address("Madrid")
                .build();
        Hotel hotel4 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Ana")
                .address("BV")
                .build();
        Hotel hotel5 = new Hotel.Builder()
                .randomID(UUID.randomUUID())
                .name("Phoenicia")
                .address("Milan")
                .build();

        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
        hotels.add(hotel4);
        hotels.add(hotel5);

        for (Hotel hotel : hotels){
            logger.log(Level.INFO, hotel);
        }



    }



}

