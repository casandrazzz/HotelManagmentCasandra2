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
}

    /**
     * Staff offers information about room price for room type
     */



    /**
     * Offer applies to minimum five nights of stay.
     * Have to check if guest nights of stay >= 5, then apply discount to costOfStay.
     */






        /*scanner = new Scanner ( System.in );
        String value = scanner.nextLine ();
        roomInput = Integer.parseInt ( value );




        boolean ok = true;
        while(ok) {
            try {
                roomInput = Integer.parseInt ( value );
                ok = false;
            } catch (NumberFormatException exception) {
                logger.log( DEBUG, "Please select an integer value ...");
            }
        }
        ok=true;
        while(ok) {
            try {
                   scanner = new Scanner ( System.in );
                value = scanner.nextLine ();
                   existingNumber ( value );
                   parseInput ( "" );
                   roomInput = Integer.parseInt ( value );
                   logger.log ( Level.ERROR, "Please enter a valid input" );
                   ok = false;
            }
            catch (InputValidation exception) {
                logger.log ( DEBUG, "Please select an existing value..." );
            }
        }


        if (roomInput == 1) {
            totalCost = StandardRoom.price * nights;
            logger.log ( INFO, totalCost );
        } else if (roomInput == 2) {
            totalCost = DoubleRoom.price * nights;
            logger.log ( INFO, totalCost );
        } else if (roomInput == 3) {
            totalCost = Apartment.price * nights;
            logger.log ( INFO, totalCost );
        } else if (roomInput == 4) {
            totalCost = Penthouse.price * nights;
            logger.log ( INFO, totalCost );
        }
    }


    //     System.out.println ( "You have to pay " + costOfStay + "$" );
    //  }


    @Override
    public String toString() {
        return getName () + " - " + getJobDescription ();
    }
}*/




