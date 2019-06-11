package model.accomodation;

import static model.people.Guest.nightsOfStay;

public class Apartment extends Room {
    public static final double price = 300;

    Apartment(int number, String type) {
        super(number, type);
    }


// --Commented out by Inspection START (6/2/2019 9:16 AM):
//    public static double calculateCost() {
//        return Apartment.price * nightsOfStay;
//
//
//    }
// --Commented out by Inspection STOP (6/2/2019 9:16 AM)

}
