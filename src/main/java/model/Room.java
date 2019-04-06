package model;

/**
 * Room has a number from 1 to 100;
 * Room has a type: DOUBLE, SINGLE, APARTEMENT;
 * Room has a status: cleaned, occupied etc.
 *
 */


public class Room {

    private int number;

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






