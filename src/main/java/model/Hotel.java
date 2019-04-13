package model;

/**
 * Hotel has a list of rooms and a list of staff, name and address;
 */

import person.Staff;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements Establishment{
    //private String name;
    //private String address;
    private List<Room> rooms = new ArrayList<>();
    private List<Staff> staff = new ArrayList<> ();




    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", staff=" + staff +
                '}';
    }


    @Override
    public void defineEstablishmentType() {

        String establishmentType = "Hotel";

        System.out.println (establishmentType);

    }

    @Override
    public void displayEstablishmentLocation() {

        String establishmentLocation = "Urban";

        System.out.println (establishmentLocation);

    }

    @Override
    public void displayEstablishmentWorkingHours() {

        String establishmentWorkingHours = "Nonstop";

        System.out.println (establishmentWorkingHours);

    }
}


