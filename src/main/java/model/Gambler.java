package model;

import app.Constants;

public class Gambler extends Person {
    private int cash;



    public Gambler(String personName, int age, String personAddress,int cash ) {
        super ( personName, age, personAddress );
    }


    public boolean checkMinimumAge() {
        if (age >= Constants.MINIMUM_AGE) {
            System.out.println ( "Welcome " + getName () + " " + "Access allowed" );

        } else {
            System.out.println ( "Sorry" + getName () + " " + "Access denied" );


        }
        return true;


    }}
