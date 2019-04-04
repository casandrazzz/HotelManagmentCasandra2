package model;

public class Guest extends Person {


    private String accomodation; //perioada de cazare
    private String preference;   //preferinta pt tipul de camera(...)

    public Guest(String personName, int age, String personAddress, String accomodation, String preference) {

        super ( personName, age, personAddress );
        this.accomodation = accomodation;
        this.preference = preference;

        Guest person = new Guest ( "Lili", 25, "Sunset Boulevard, 507", "25/02/2019 until 27/02/2019", "DOUBLE" );

           }

            }

