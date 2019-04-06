package person;

import java.util.ArrayList;
import java.util.List;

/**
 * Staff extends Person because it has name, address and age.
 * Staff has a job description according to the task, e.g giveInformation = receptionist
 */

public class Staff  extends Person {

    private static String jobDescription;


    public Staff(String personName, int age, String personAddress, String jobDescription) {
        super ( personName, age, personAddress );
        this.setJobDescription ( jobDescription );
    }


    List<Staff> staff = new ArrayList<> ();

    private String getJobDescription() {
        jobDescription = jobDescription;
        return jobDescription;
    }

    private void setJobDescription(String jobDescription) {

        this.jobDescription = jobDescription;
    }

    /**
     * Staff offers information about room price for room type
     */
    public static void giveInformation() {
        if (jobDescription.contains ( "Receptionist" )) {
            System.out.println ( "Welcome!" );

        } else {
            System.out.println ( "Hello! I will take you to the Reception" );
        }

        if (jobDescription.contains ( "Room Service" )) {
            System.out.println ( "What can I do for you?" );

        } else {
            System.out.println ( "Hello! I will take you to the Reception" );


        }


    }

    public List<Staff> getStaff() {
        return staff;
    }



    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }


}
