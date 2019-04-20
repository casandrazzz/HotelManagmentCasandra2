package service;

import model.Hotel;
import model.Responses;
import repository.HotelRepository;

import java.util.List;
import java.util.Scanner;

import static model.Responses.NO;
import static model.Responses.YES;


public class HotelService {

    Scanner s = new Scanner ( System.in );
    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public String validateAndAddHotels(Hotel hotel) {

        String name = hotel.getName ();


        if (name == ("")) {
            return "Please provide a name for the hotel. EMPTY STRING INPUT";
        }

        if (name == null) {
            return "NULL OBJECT";

        }

        if (name.length () > 50) {

            return "Please enter a name that has maximum 50 characters";

        }

        boolean responseFromRepo = hotelRepository.add ( hotel );

        if (responseFromRepo) {
            return "Hotel was added successfully. ";
        }
        return "Hotel was not added successfully";
    }

    public boolean delete(Hotel hotel) {

        System.out.println ( "Are you sure you want to delete this item? Respond with YES or NO" );

        String responsesStr = s.next ();
        Responses responses = Responses.valueOf ( responsesStr.toUpperCase () );


        if (responses == YES) {
            System.out.println ( "Hotel removed successfuly" );


        }

        if (responses == NO){
            System.out.println ("Hotel was not removed");
        }

        return true;
    }
}

