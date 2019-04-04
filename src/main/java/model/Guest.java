package model;

import java.util.Date;

public class Guest extends Person {


    private Date checkInDate;
    private Date checkOutDate;


    //perioada de cazare
    private String preference;   //preferinta pt tipul de camera(...)

    public Guest(String personName, int age, String personAddress, Date checkInDate, Date checkOutDate, String preference) {

        super ( personName, age, personAddress );
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.preference = preference;


           }

            }

