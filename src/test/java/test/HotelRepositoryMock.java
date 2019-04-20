package test;

import model.Hotel;
import repository.IHotel;

import java.util.List;

public class HotelRepositoryMock implements IHotel {
    @Override
    public boolean add(Hotel hotel) {
        return false;
    }

    @Override
    public void remove(Hotel hotel) {

    }

    @Override
    public List<Hotel> listHotels() {
        return null;
    }
}
