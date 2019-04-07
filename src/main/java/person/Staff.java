package person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Staff extends Person because it has name, address and age.
 * Staff has a job description according to the task, e.g giveInformation = receptionist
 */

public class Staff  extends Person {

    private static String jobDescription;


    public Staff(String personName, int age, String personAddress, String jobDescription) {
        super ();

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




    public List<Staff> getStaff(Staff reception) {
        return staff;
    }



    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }


    @Override
    public void Interactions() {

        System.out.println ("Here is the list of rooms we have. Enter a number corresponding to the type of room you want, 1 to 33 are single rooms, 34 to 65 are double rooms and 66 to 100 are apartments");

        Scanner reader = new Scanner ( System.in );
        int n = reader.nextInt ();

        System.out.println (n);

        for (n=5; n<=14; n++);{
            System.out.println ("The room is already booked");
        }

        for (n=1; n<5; n++);{
            System.out.println ("You have booked your room");
        }

        }

    }

