package repository;

import model.people.Staff;

import java.util.List;

public interface IStaff {
    List<Staff> listStaff();


    boolean add (Staff staff);

    void remove (Staff staff);


}
