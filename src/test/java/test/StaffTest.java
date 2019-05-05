package test;


import model.people.Staff;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test for Staff")
@TestInstance ( TestInstance.Lifecycle.PER_CLASS )
public class StaffTest {


    private Staff receptionist;

    StaffTest(Staff receptionist) {
        this.receptionist = receptionist;
    }

    @BeforeAll
    public void setup() {
        Staff receptionist = new Staff ( "Rachel" );

    }

    @Test
    protected void should_getReceptionistName() {
        Staff receptionist = new Staff ( "Rachel", 25, "B.H." );


        assertEquals ( "Rachel", receptionist.getName () );

    }

    @Test
    public void should_getReceptionistJobDescription() {
        Staff receptionist = new Staff ( "Rachel", 25, "B.H." );
        receptionist.setJobDescription ( "Welcomes guests" );


        assertEquals ( "Welcomes guests", receptionist.getJobDescription () );

    }


}



