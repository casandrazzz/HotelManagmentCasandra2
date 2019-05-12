package model.people;

import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;

/**
 * Person is abstract class. Contains name, age, address.
 * Contains method Interaction, Pay and DateBetweenDays (to calculate the duration of booking a room))
 */
@Getter
@Setter

public class Person {
    int age;
    String name;
    String address;

    private static Logger logger = Logger.getLogger ( "Person Class" );


    Person(String name, int age, String address) {
        this.setName ( name );
        this.setAge ( age );
        this.setAddress ( address );
    }


    Person() {

    }






}

