package model;

public class Staff  extends Person{

    private String jobDescription;


    public Staff(String personName, int age,  String personAddress, String jobDescription) {
        super ( personName, age, personAddress );
        this.jobDescription = jobDescription;
    }

    Staff person = new Staff ( "Aylin", 24, "West City", "Receptionist" );
}
