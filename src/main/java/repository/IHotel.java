package repository;

import model.Hotel;

import java.util.List;

public interface IHotel {

    boolean add (Hotel hotel);

    void remove (Hotel hotel);

    List<Hotel> listHotels ();
}
