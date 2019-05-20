package model.accomodation;

import static model.people.Guest.nightsOfStay;

public class Apartment extends Room {
    public static double price = 300;

    public Apartment(int number, String type) {
        super(number, type);
    }


    public static double calculateCost() {
        return Apartment.price * nightsOfStay;


    }

}
