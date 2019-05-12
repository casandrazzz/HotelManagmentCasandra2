package model.accomodation;

import lombok.Getter;
import lombok.Setter;
import model.people.Guest;

@Getter
@Setter

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

    @Deprecated
    public static double calculateCost() {
        return Penthouse.price * Guest.nightsOfStay;


    }
}
