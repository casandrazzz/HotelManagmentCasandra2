package repository;

import lombok.ToString;
import model.commercial.Hotel;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.*;

@ToString

public class HotelRepository implements IHotel {

    private List<Hotel> hotels = new ArrayList<>();

    private Logger logger = Logger.getLogger("Hotel Repository ");

    @Override
    public boolean add(Hotel hotel) {
        if (hotel != null) {

            hotels.add(hotel);
            logger.log(Level.INFO, "Hotel added successfully");
            return true;
        } else {
            logger.log(Level.INFO, "Failed to add hotel");
            return false;
        }
    }


    @Override
    public void remove(Hotel hotel) {

        hotels.remove(hotel);
        logger.log(Level.INFO, "Hotel removed");

    }

    @Override
    public List<Hotel> listHotels() {
        return hotels;
    }



}
