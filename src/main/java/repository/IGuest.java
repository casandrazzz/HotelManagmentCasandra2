package repository;

import model.people.Guest;

import java.util.List;

public interface IGuest {
    List<Guest> listGuest();


    boolean add(Guest guests);

    void remove(Guest guests);



}
