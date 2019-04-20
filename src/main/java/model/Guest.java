package model;

import java.util.Date;


public class Guest extends Person {


    public static int nightsOfStay;
    private Date checkInDate;
    private Date checkOutDate;
    private String preference;


    public Guest(String personName, int age, String personAddress) {

        super ( personName, age, personAddress );
    }


    public void setCheckInDate(Date checkInDate) {

        this.checkInDate = checkInDate;
    }


    public String getPreference() {

        return preference;
    }

    public void setPreference(String preference) {

        this.preference = preference;
    }

    public int getNightsOfStay() {

        return nightsOfStay;
    }

    public void setNightsOfStay(int nightsOfStay) {

        Guest.nightsOfStay = nightsOfStay;
    }

    public void interactions() {


        System.out.println ( "Hello, I would like to book a room." );


    }

    @Override
    public String toString() {
        return getName () + " - " + getPreference () + "-" + getNightsOfStay () + " nights.";
    }
}




   /* public int pay(int days, int price) {

        return 0;
    }

    public int computePeriod(Date checkIn, Date checkOut) {
        long days = checkOut.getTime () - checkIn.getTime ();
        return (int) days / (1000 * 60 * 60 * 24);

    }*/





