package repository;

import model.commercial.Hotel;

import java.util.List;

public interface IHotel {

    boolean add(Hotel hotel);

    void remove(Hotel hotel);

    List<Hotel> listHotels();
}
