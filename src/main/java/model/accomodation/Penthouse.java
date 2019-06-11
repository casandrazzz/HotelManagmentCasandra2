package model.accomodation;

import lombok.Getter;
import lombok.Setter;
import model.people.Guest;

@Getter
@Setter

public class Penthouse extends Apartment {
    public static double price = 1000;

    public Penthouse(int number, String type) {
        super(number, type);
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        Penthouse.price = price;
    }

    @Deprecated
    public static double calculateCost() {
        return Penthouse.price * Guest.nightsOfStay;


    }
}
