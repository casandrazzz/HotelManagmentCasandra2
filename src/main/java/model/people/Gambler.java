package model.people;

import app.Constants;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Gambler extends Person {
    private int cash;
    private static Logger logger = Logger.getLogger ("Gambler Class");



    public Gambler(String personName, int age, String personAddress,int cash ) {
        super ( personName, age, personAddress );
    }

    public boolean checkMinimumAge() {

        if (age >= Constants.MINIMUM_AGE) {
            logger.log (Level.INFO, "Welcome " + getName () + " " + "Access allowed" );

        } else {
            logger.log ( Level.INFO, "Sorry" + getName () + " " + "Access denied");


        }
        return true;


    }




}
