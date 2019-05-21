/**
 * Contains List and add/remove methods
 * TODO to implement IRepository
 */

package repository;

import model.people.Staff;

import java.util.List;

public interface IStaff {



    boolean add(Staff staff);

    void remove(Staff staff);
    List<Staff> listStaff();


}
