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
    private static final int stars = 5;





    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", staff=" + staff +
                '}';
    }


}


