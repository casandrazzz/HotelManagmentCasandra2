package model.accomodation;


import lombok.ToString;
import org.apache.log4j.Logger;

/**
 * Room has a number from 1 to 100;
 * Room has a type: DOUBLE, SINGLE, APARTEMENT-> to do Enum for user input; also room types are extended in classes to define properly their attributes
 * Room has a status: cleaned, occupied etc.
 * Array is used also for printing the highest price.
 * Room has a method to calculate the cost of stay, which is overridden in Apartment, StandardRoom, DoubleRoom, Penthouse classes.
 */
@ToString

public class Room {

    public static int price;
    private static Logger logger = Logger.getLogger(Room.class);
    public final int MAXIMUM_NUMBER_OF_ROOMS = 100;
    private int number;
    private String type;
    private String name;
    private boolean occupied;
    private boolean cleaned;


    public String getName() {

        return name;
    }
    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }


    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(int price) {

        Room.price = price;
    }

    public boolean isOccupied() {

        return occupied;
    }

    public void setOccupied(boolean occupied) {

        this.occupied = occupied;
    }

    public boolean isCleaned() {

        return cleaned;
    }

    public void setCleaned(boolean cleaned) {

        this.cleaned = cleaned;
    }


}


















