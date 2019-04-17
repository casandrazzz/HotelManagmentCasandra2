import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import person.Staff;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    private Staff receptionist;

    @Before
    public void setup() {
        Staff staff = new Staff ( "Rachel" );

    }

    @Test
    public void should_getReceptionistName() {
        Staff receptionist = new Staff ( "Rachel", 25, "B.H." );


        assertEquals ( "Test", "Rachel", receptionist.getName () );

    }

    @Test
    public void should_getReceptionistJobDescription() {
        Staff receptionist = new Staff ( "Rachel", 25, "B.H." );
        receptionist.setJobDescription ( "Welcomes guests" );


        assertEquals ( "Test", "Welcomes guests", receptionist.getJobDescription () );

    }


}



