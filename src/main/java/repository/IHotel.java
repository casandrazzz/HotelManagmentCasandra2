package repository;

import model.commercial.Hotel;

import java.util.List;

interface IHotel {

    boolean add(Hotel hotel);

    void remove(Hotel hotel);

    List<Hotel> listHotels();
}
