package model.commercial;

/**
 * Hotel has a list of rooms and a list of staff, name and address;
 */

public class Hotel implements Establishment, LanguageVersion {
    private String name;
    private String address;
    private int MINIMUM_ROOMS=5;

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


