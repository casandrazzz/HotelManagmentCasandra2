package model.accomodation;


import model.people.Guest;

public class DoubleRoom extends Room {
    public static double price = 200;
    private int area = 30;
    private int personsAllowed = 2;



    public static double calculateCost() {
        if (Guest.nightsOfStay >= 5)
            return DoubleRoom.price * Guest.nightsOfStay * 0.5;
        else {
            return DoubleRoom.price * Guest.nightsOfStay;


        }
    }
}


