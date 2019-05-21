package model.people;

import app.Constants;
import lombok.Getter;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

@Getter

public class Gambler extends Person {
    private int cash;
    private static Logger logger = Logger.getLogger("Gambler Class");


    public Gambler(String personName, int age, String personAddress, int cash) {
        super(personName, age, personAddress);
    }

    public boolean checkMinimumAge() {

        if (age >= Constants.MINIMUM_AGE) {
            logger.log(Level.INFO, "Welcome " + getName() + " " + "Access allowed");

        } else {
            logger.log(Level.INFO, "Sorry" + getName() + " " + "Access denied");


        }
        return true;


    }


    List<Integer> luckyNumber = Arrays.asList(1, 20, 35, 48, 8, 6, 7);

    public static int winSomeLooseSome(List<? extends Number> list) {

        int sum = 0;
        for (Number i : list) {

            sum += i.intValue();
        }
        return sum;


    }

}



