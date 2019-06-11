package model.accomodation;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class StandardRoom extends Room {

    public static double price = 100;
    private int area = 35;
    private int NUMBER_OF_BEDS = 1;

    public StandardRoom(int number, String type) {
        super(number, type);
    }

// --Commented out by Inspection START (6/2/2019 9:15 AM):
//    public StandardRoom(int number, String type) {
//        super(number, type);
//    }
// --Commented out by Inspection STOP (6/2/2019 9:15 AM)


// --Commented out by Inspection START (6/2/2019 9:15 AM):
//    public static double calculateCost() {
//        return StandardRoom.price * Guest.nightsOfStay;
//    }
// --Commented out by Inspection STOP (6/2/2019 9:15 AM)
}
