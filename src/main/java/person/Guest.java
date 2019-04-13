package person;

import java.util.Date;



public class Guest extends Person {


    private Date checkInDate;
    private Date checkOutDate;
    private String preference;


    public Guest(String personName, int age, String personAddress) {

        super ( personName, age, personAddress );
    }


    public void setPreference() {

        preference = "DOUBLE";
    }

    public Date getCheckInDate() {

        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {

        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {

        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {

        this.checkOutDate = checkOutDate;
    }

    public String getPreference() {

        return preference;
    }

    public void setPreference(String preference) {

        this.preference = preference;
    }


    public void interactions() {


        System.out.println ( "Hello, I would like to book a room." );


    }


    public int pay(int days, int price) {
        return 0;
    }

    public int computePeriod(Date checkIn, Date checkOut) {
        long days = checkOut.getTime () - checkIn.getTime ();
        return (int) days / (1000 * 60 * 60 * 24);

    }


}


