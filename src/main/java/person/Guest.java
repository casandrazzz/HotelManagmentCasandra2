package person;

import java.util.Date;



public class Guest extends Person {


    private Date checkInDate;
    private Date checkOutDate;
    private String preference;


    public Guest(String personName, int age, String personAddress) {

        super ();
        this.setCheckInDate ();
        this.setCheckOutDate ( checkOutDate );
        this.setPreference ( preference );




           }

    public void setPreference() {

        preference = "DOUBLE";
    }

    public Date getCheckInDate() {

        return checkInDate;
    }

    public void setCheckInDate () {

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

    @Override
    public void Interactions() {


        System.out.println ("Hello, I would like to book a room.");


    }

    @Override
    public void Pay() {

        System.out.println ("Cash");



    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }
}

