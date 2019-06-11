package test.repositoryTest;

import model.people.Staff;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import repository.StaffRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StaffRepositoryTest {

    private static StaffRepository staffRepository;

    @BeforeAll
    static void setup() {
        staffRepository = new StaffRepository ();
    }

    @Test
    void should_add_staff_if_not_null() {
        Staff staff = new Staff ( "Giulie", 32, "Colorado");
        boolean response = staffRepository.add ( staff );
        assertTrue ( response );
    }

    @Test
    void should_remove_staff() {
        List<Staff> staffRepository = new ArrayList<> ();
        Staff staff = new Staff ("Chris", 31, "Spain");
        staffRepository.add ( staff );
        staffRepository.remove ( staff);
        assertEquals ( staffRepository.size (), 0 );
    }

    @Test
    void shouldNot_AddEmployee_For_Null() {

        Staff staff = new Staff ();
        staff.setName ( null );

        boolean response = staffRepository.add ( null );

        assertFalse ( response );


    }

}




