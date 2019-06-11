package repository;

import model.people.Guest;

import java.util.Set;

interface IGuest {
    Set<Guest> guestsSet();


    boolean add(Guest guests);

    void remove(Guest guests);
}
