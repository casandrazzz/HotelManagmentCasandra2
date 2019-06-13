package test.serviceTest;


import model.people.Staff;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import repository.StaffRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test for Staff")
@TestInstance ( TestInstance.Lifecycle.PER_CLASS )
class StaffServiceTest {
    @Mock
    private static StaffRepository staffRepository;

     @BeforeAll
     void setup() {
         new Staff ( "Rachel" ,24, "Luxembourg"  );
     }

    @Test
    void should_getReceptionistName() {
        Staff receptionist = new Staff ( "Rachel", 25, "B.H." );

        assertEquals ( "Rachel", receptionist.getName () );

    }

    @Test
    void should_getReceptionistJobDescription() {
        Staff receptionist = new Staff ( "Rachel", 25, "B.H." );
        receptionist.setJobDescription ( "Welcomes guests" );


        assertEquals ( "Welcomes guests", receptionist.getJobDescription () );

    }




}



