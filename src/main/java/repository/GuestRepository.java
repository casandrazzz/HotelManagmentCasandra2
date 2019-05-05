package repository;

import model.people.Guest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuestRepository implements IGuest {

    private List<Guest> guests = new ArrayList<> ();

    @Override
    public List<Guest> listGuest() {
        return Collections.emptyList ();
    }

    @Override
    public boolean add(Guest guests) {
        return false;
    }

    @Override
    public void remove(Guest guests) {

    }
}
