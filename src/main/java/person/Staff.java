package person;

import java.util.Scanner;

/**
 * Staff extends Person because it has name, address and age.
 * Staff has a job description according to the task, e.g giveInformation = receptionist
 */

public class Staff extends Person {

    private String jobDescription;


    public Staff(String personName, int age, String personAddress) {
        super ( personName, age, personAddress );

    }

    public Staff(String personName) {
        super ( personName );
    }


    public String getJobDescription() {
        return jobDescription;
    }

    public String setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return jobDescription;
    }

    /**
     * Staff offers information about room price for room type
     */

    public void interactions() {

        System.out.println ( "Here is the list of rooms we have. Enter a number corresponding to the type of room you want, 1 to 33 are single rooms, 34 to 65 are double rooms and 66 to 100 are apartments" );

        Scanner reader = new Scanner ( System.in );
        int n = reader.nextInt ();

        System.out.println ( n );


    }

    /**
     * Offer applies to minimum five nights of stay.
     * Have to check if guest nights of stay >= 5, then apply discount to costOfStay.
     */
    public void presentOffer() {

        System.out.println ( "For at least 5 days at our hotel you can get 50% discount" );

        if (Guest.nightsOfStay >= 5) {
            System.out.println ("Discount applies for" + Guest.nightsOfStay + "nights of stay");
        } else {
            System.out.println ( "Discount does not apply" );

        }
    }

        public void askGuest () {
            System.out.println ( "How many nights would you like to stay" );

            Scanner reader = new Scanner ( System.in );
            int nights = reader.nextInt ();
            int costOfStay = nights * 200;
            System.out.println ( "You have to pay " + costOfStay + "$" );
        }


    @Override
    public String toString() {
        return getName () + " - " + getJobDescription ();
    }
}




