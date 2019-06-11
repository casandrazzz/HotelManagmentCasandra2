package model.people;

import org.apache.log4j.Logger;



/**
 * Staff extends Person because it has name, address and age.
 * Staff has a job description according to the task, e.g giveInformation = receptionist
 * Staff gets a minimum salary.
 */

public class Staff extends Person {


    private static Logger logger = Logger.getLogger ( "Staff Class" );
    private String jobDescription;
    static int salary;


    public Staff(String personName, int age, String personAddress) {
        super ( personName, age, personAddress );

    }

       public Staff() {

    }


    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }



/*
  Staff offers information about room price for room type
  <p>
  Offer applies to minimum five nights of stay.
  Have to check if guest nights of stay >= 5, then apply discount to costOfStay.
  <p>
  Offer applies to minimum five nights of stay.
  Have to check if guest nights of stay >= 5, then apply discount to costOfStay.
 */


/**
 * Offer applies to minimum five nights of stay.
 * Have to check if guest nights of stay >= 5, then apply discount to costOfStay.
 */




    @Override
    public String toString() {

        return getName () + " - " + getJobDescription ();
    }

    public void add(Staff staff) {
    }

    public void remove(Staff staff) {
    }
}




