package model.people;

import org.apache.log4j.Logger;

/**
 * Person is abstract class. Contains name, age, address.
 * Contains method Interaction, Pay and DateBetweenDays (to calculate the duration of booking a room))
 */


public class Person {
    protected int age;
    private String name;
    private String address;

    private static Logger logger = Logger.getLogger ( "Person Class" );


    public Person(String name, int age, String address) {
        this.setName ( name );
        this.setAge ( age );
        this.setAddress ( address );
    }

    public Person(String name) {
        this.setName ( name );

    }

    public Person() {

    }


    public String getName() {


        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }




}

