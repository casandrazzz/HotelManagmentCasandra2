package test.serviceTest;

import model.people.Gambler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblerTest {

    private Gambler gambler;


    @Test
    void should_notAllowGamblerUnder18() {
        // GIVEN

        Gambler gambler = new Gambler ( "Andrew", 12, "Beverly Hills", 50 );

        //WHEN
        gambler.checkMinimumAge ();

        //THEN

        assertTrue(gambler.checkMinimumAge());
    }

    @Test
    void should_allowGamblerOver18() {
        // GIVEN

        Gambler gambler1= new Gambler ( "Andrew", 19, "Beverly Hills", 50 );

        //WHEN
        gambler1.checkMinimumAge ();

        //THEN

        assertTrue(gambler1.checkMinimumAge());
    }

    @Test
    void should_allowGamblerEqual_18() {
        // GIVEN


        Gambler gambler2= new Gambler ( "Andrew", 18, "Beverly Hills", 50 );



        //WHEN

        gambler2.setAge ( 18 );


        //THEN
        assertEquals ( 18, gambler2.getAge() );
    }
}




