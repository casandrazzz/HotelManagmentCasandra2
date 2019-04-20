package model;


public class DoubleRoom extends Room {
    private int price = 200;
    private int area = 30;
    private int personsAllowed = 2;


    @Override
    public double calculateCostOfStay() {
        if (Guest.nightsOfStay >= 5)
            return price * Guest.nightsOfStay * 0.5;
        else {
            return price * Guest.nightsOfStay;


        }
    }
}


