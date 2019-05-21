package model.accomodation;


import lombok.ToString;

import java.util.UUID;

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
    private int number;
    private UUID id;
    private String type;
    private boolean occupied;

    public Room(int number, String type) {
        this.id = UUID.randomUUID();
        this.number = number;
        this.type = type;
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


}



















