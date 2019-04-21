package test;


import model.Staff;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaffTest {

    private Staff receptionist;

    @BeforeAll
    public void setup() {
        Staff staff = new Staff ( "Rachel" );

    }

    @Test
    public void should_getReceptionistName() {
        Staff receptionist = new Staff ( "Rachel", 25, "B.H." );


        assertEquals (  "Rachel", receptionist.getName () );

    }

    @Test
    public void should_getReceptionistJobDescription() {
        Staff receptionist = new Staff ( "Rachel", 25, "B.H." );
        receptionist.setJobDescription ( "Welcomes guests" );


        assertEquals ( "Welcomes guests", receptionist.getJobDescription () );

    }


}



