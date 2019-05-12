package repository;

import model.people.Guest;
import model.people.Staff;

import java.util.Collections;
import java.util.List;

public class PersonRepository implements IGuest, IStaff {
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


    @Override
    public List<Staff> listStaff() {
        return Collections.emptyList ();
    }

    @Override
    public boolean add(Staff staff) {
        return false;
    }

    @Override
    public void remove(Staff staff) {

    }
}
