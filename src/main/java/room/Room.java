package room;


import person.Guest;

/**
 * Room has a number from 1 to 100;
 * Room has a type: DOUBLE, SINGLE, APARTEMENT-> to do Enum for user input; also room types are extended in classes to define properly their attributes
 * Room has a status: cleaned, occupied etc.
 * Array is used also for printing the highest price.
 * Room has a method to calculate the cost of stay, which is overridden in Apartment, StandardRoom, DoubleRoom, Penthouse classes.
 */


public class Room {

    private int number;

    private int price;

    private String type;

    private boolean occupied;

    private boolean cleaned;


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

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
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


    public int displayApartmentPrice() {
        int[] prices = {100, 200, 300};
        int largest = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > largest) {
                largest = prices[i];

            }
        }

        return largest;
    }

    public double calculateCostOfStay() {
        return price * Guest.nightsOfStay;

    }

}














