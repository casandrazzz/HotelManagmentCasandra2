package repository;

import model.commercial.Hotel;
import model.people.Guest;
import model.people.Staff;

import java.util.ArrayList;
import java.util.List;

public class HotelRepository implements IHotel{

    private List<Hotel> hotels = new ArrayList<> ();

    private List<Staff> staff = new ArrayList<> ();
    private List<Guest> guests = new ArrayList<> ();



    public List<Staff> listStaff() {
        return listStaff ();

    }

    public List<Guest> listGuests() {
        return listGuests ();

    }

    @Override
    public boolean add(Hotel hotel) {
       if (hotel !=null){

        hotels.add(hotel);
           System.out.println ("Hotel added successfully");
        return true;
          }
       else{
           System.out.println ("Failed to add hotel");
          return false;
       }
   }


    @Override
    public void remove(Hotel hotel) {

        hotels.remove ( hotel );
        System.out.println ("Hotel removed");

    }

    @Override
    public List<Hotel> listHotels() {
        return hotels;
    }


}
