package repository;

import model.Guest;
import model.Hotel;
import model.Room;
import model.Staff;

import java.util.ArrayList;
import java.util.List;

public class HotelRepository implements IHotel{

    private List<Hotel> hotels = new ArrayList<> ();
    private List<Room> rooms = new ArrayList<> ();
    private List<Staff> staff = new ArrayList<> ();
    private List<Guest> guests = new ArrayList<> ();

   public List<Room> listRooms() {
        return listRooms ();

    }

    public List<Staff> listStaff() {
        return listStaff ();

    }

    public List<Guest> listGuests() {
        return listGuests ();

    }

    @Override
    public boolean add(Hotel hotel) {

        hotels.add(hotel);
        return true;
    }

    @Override
    public void remove(Hotel hotel) {

        hotels.remove ( hotel );

    }

    @Override
    public List<Hotel> listHotels() {
        return hotels;
    }


}
