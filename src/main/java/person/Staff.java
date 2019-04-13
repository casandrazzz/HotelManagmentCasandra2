package person;

import java.util.Scanner;

/**
 * Staff extends Person because it has name, address and age.
 * Staff has a job description according to the task, e.g giveInformation = receptionist
 */

public class Staff extends Person {

    private  String jobDescription;


    public Staff(String personName, int age, String personAddress) {
        super ( personName, age, personAddress );

    }


    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * Staff offers information about room price for room type
     */
   /* public void giveInformation() {
        if (jobDescription.contains ( "Receptionist" )) {
            System.out.println ( "Welcome!" );

        } else {
            System.out.println ( "Hello! I will take you to the Reception" );
        }

        if (jobDescription.contains ( "Room Service" )) {
            System.out.println ( "What can I do for you?" );

        } else {
            System.out.println ( "Hello! I will take you to the Reception" );


        }*/

    public void interactions() {

        System.out.println ( "Here is the list of rooms we have. Enter a number corresponding to the type of room you want, 1 to 33 are single rooms, 34 to 65 are double rooms and 66 to 100 are apartments" );

        Scanner reader = new Scanner ( System.in );
        int n = reader.nextInt ();

        System.out.println ( n );


    }

    public void askGuest () {
        System.out.println ("How many days would you like to stay");

        Scanner reader = new Scanner ( System.in );
        int days = reader.nextInt ();
        int costOfStay = days * 200;
        System.out.println ( "You have to pay " + costOfStay + "$");
    }


    public int pay(int days, int price) {
        return 0;
    }





    /**
     * Cost of stay
     */



    @Override
    public String toString() {
        return getName () + " - " + getJobDescription ();
    }
}



