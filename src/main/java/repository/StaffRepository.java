package repository;

import model.people.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffRepository implements IStaff {

    private List<Staff> staff = new ArrayList<> ();


    @Override
    public List<Staff> listStaff() {
        return staff;
    }

    @Override
    public boolean add(Staff staff) {
        return false;
    }

    @Override
    public void remove(Staff staff) {

    }
}
