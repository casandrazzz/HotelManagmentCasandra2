package model;


public class Room {

    private int number;

    private String type;

    private boolean occupied;

    private boolean cleaned;

    public Room(int roomNumber, String roomType, boolean occupied, boolean cleaned) {
        this.number = roomNumber;
        this.type = roomType;
        this.occupied = occupied;
        this.cleaned = cleaned;
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


