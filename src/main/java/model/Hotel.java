package model;

/**
 * Hotel has a list of rooms and a list of staff, name and address;
 */

import repository.HotelRepository;

public class Hotel implements Establishment {
    private String name;
    private String address;

    public Hotel () {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*@Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + HotelRepository.rooms +
                ", staff=" + HotelRepository.staff +
                ", guests" + HotelRepository.guests;
    }*/


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


