package model;

public class Staff  extends Person{

    private String jobDescription;


    public Staff(String personName, int age,  String personAddress, String jobDescription) {
        super ( personName, age, personAddress );
        this.jobDescription = jobDescription;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
