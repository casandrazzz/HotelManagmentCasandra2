package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> rooms = new ArrayList<Room>();
    public void displayRooms (Room room) {
        rooms.add ( room );
    }

    public static void main(String[] args) {
        Hotel hotel;
        hotel = new Hotel ();
        hotel.hotelName();
        hotel.hotelAdress();
        hotel.hotelEmail();

    }

    private void hotelName() {

        final String firstName;
        firstName = "ResidenceInn";
        final String secondName;
        secondName = "Mariott";

        System.out.println("Welcome to " + firstName + secondName + "!" + "" +
                " Enjoy the experiece!");

    }

    private void hotelAdress() {

        final String streetName;
        streetName = "West Century Boulevard";
        final int streetNumber = 5963;
        final String city = "Los Angeles";
        final String country = "USA";

        System.out.println("We are located on " + streetNumber + ", " + streetName + ", " + city + ", " + country + ". " );

    }

    private void hotelEmail() {

        final String email;
        email = "residence_inn@mariott_hotels.com";
        System.out.println("You can contact us by email: " + email + " or by phone: +1 310-568-770. " +
                "Our operators are always there to answer.");

    }


}
