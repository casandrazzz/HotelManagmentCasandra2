package test;
import model.Gambler;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

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


