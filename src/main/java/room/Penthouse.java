package room;

import person.Guest;

public class Penthouse extends Apartment {
    private int price = 1000;


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public double calculateCostOfStay() {
        return price * Guest.nightsOfStay;


    }
}
