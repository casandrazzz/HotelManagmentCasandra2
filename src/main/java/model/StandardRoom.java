package model;

public class StandardRoom extends Room {

    private int price = 100;
    private int area = 35;
    private int NUMBER_OF_BEDS = 1;


    @Override
    public double calculateCostOfStay() {
        return price * Guest.nightsOfStay;
    }
}
