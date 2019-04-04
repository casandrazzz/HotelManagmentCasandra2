package model;

/**
 * Hotel has a list of rooms and a list of staff, name and address;
 */

import person.Staff;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private String address;
    private List<Room> rooms = new ArrayList<Room>();
    private List<Staff> staff;

    private static final int numberOfrooms = 100;



    public Hotel() {
        setStaff ( new ArrayList<Staff>() );
    }

    public static int getNumberOfrooms() {
        return numberOfrooms;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
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
