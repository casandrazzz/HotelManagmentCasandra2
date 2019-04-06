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
    private List<Room> rooms = new ArrayList<>();
    private List<Staff> staff = new ArrayList<> (  );
    private static final int numberOfRooms = 100;

    public Hotel() {

        setStaff ( new ArrayList<Staff>() );
        Staff Reception = new Staff ( "Annie", 25, "South", "Receptionist" );
        Staff Service = new Staff ( "Jane", 28, "East", "Room Service" );
        staff.add ( Reception );
        staff.add ( Service );
        System.out.println (getStaff ());

        System.out.println (getNumberOfRooms ());

    }

    public static int getNumberOfRooms() {

        return numberOfRooms;

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


