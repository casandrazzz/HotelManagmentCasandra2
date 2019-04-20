package test;

import org.junit.Test;
import model.Gambler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GamblerTest {

    private Gambler gambler;


    @Test
    void should_notAllowGamblerUnder18(){
        // GIVEN

        Gambler gambler = new Gambler ("Andrew", 12 , "Beverly Hills", 50);

//WHEN



//THEN

        assertEquals (true, gambler.checkMinimumAge ());
    }
}


