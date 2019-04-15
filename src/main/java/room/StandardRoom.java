package room;

import person.Guest;
import room.Room;

public class StandardRoom extends Room {

    private int price = 100;
    private int area = 35;
    private int personsAllowed = 1;

    @Override
    public double calculateCostOfStay() {
        return price * Guest.nightsOfStay;
    }
}
