package model;

/**
 * Hotel has a list of rooms and a list of staff, name and address;
 */

import person.Staff;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static String name;
    private static String address;
    private List<Room> rooms = new ArrayList<>();
    private List<Staff> staff = new ArrayList<> (  );
    private static final int totalRooms = 100;




    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", staff=" + staff +
                '}';
    }

    public  void setName(String name) {

        this.name = name;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = "LA";
    }

    public List<Room> getRooms() {

        return rooms;
    }

    public void setRooms(List<Room> rooms) {

        this.rooms = rooms;
    }

    public List<Staff> getStaff() {

        return staff;
    }

    public void setStaff(List<Staff> staff) {

        this.staff = staff;
    }



}


