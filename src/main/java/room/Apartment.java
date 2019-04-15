package room;

import person.Guest;
import room.Room;

public class Apartment extends Room {
    private int price = 300;

    @Override
    public double calculateCostOfStay() {
        return price * Guest.nightsOfStay;


    }

}
