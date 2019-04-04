package person;

/**
 * Staff extends Person because it has name, address and age.
 * Staff has a job description according to the task, e.g giveInformation = receptionist
 */

public class Staff  extends Person {

    private String jobDescription;


    public Staff(String personName, int age,  String personAddress, String jobDescription) {
        super ( personName, age, personAddress );
        this.setJobDescription ( jobDescription );
    }

    private String getJobDescription() {
        return jobDescription;
    }

    private void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * Staff offers information about room price for room type
     */
    public static void giveInformation() {



    }



}
