package person;

import java.util.Date;



public class Guest extends Person {


    private Date checkInDate;
    private Date checkOutDate;


    //perioada de cazare
    private String preference;   //preferinta pt tipul de camera(...)

    public Guest(String personName, int age, String personAddress, Date checkInDate, Date checkOutDate, String preference) {

        super ( personName, age, personAddress );
        this.setCheckInDate ( checkInDate );
        this.setCheckOutDate ( checkOutDate );
        this.setPreference ( preference );


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
}

