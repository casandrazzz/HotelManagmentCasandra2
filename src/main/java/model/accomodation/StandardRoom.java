package model.accomodation;

import lombok.Getter;
import lombok.Setter;
import model.people.Guest;
@Getter
@Setter

public class StandardRoom extends Room {

    public static double price = 100;
    private int area = 35;
    private int NUMBER_OF_BEDS = 1;


    public static double calculateCost() {
        return StandardRoom.price * Guest.nightsOfStay;
    }
}
