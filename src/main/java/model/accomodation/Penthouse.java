package model.accomodation;

import model.people.Guest;

public class Penthouse extends Apartment {
    public static double price = 1000;


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }


    public static double calculateCost() {
        return Penthouse.price * Guest.nightsOfStay;


    }
}
