/**
 *  Contains List and add/remove methods
 *  TODO to implement IRepository
 */
package repository;

import model.people.Staff;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StaffRepository implements IStaff {

    private List<Staff> staff = new ArrayList<> ();
    private Logger logger = Logger.getLogger ( "Staff Repository " );

    @Override
    public List<Staff> listStaff() {
        return staff;
    }

    @Override
    public boolean add(Staff staff) {
        if (staff != null) {

            staff.add ( staff );
            logger.log ( Level.INFO, "Employee added successfully" );
            return true;
        } else {
            logger.log ( Level.INFO, "Failed to add employee" );
            return false;
        }

    }

    @Override
    public void remove(Staff staff) {
        staff.remove ( staff );

    }
}
