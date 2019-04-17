package person;

/**
 * Person is abstract class. Contains name, age, address.
 * Contains method Interaction, Pay and DateBetweenDays (to calculate the duration of booking a room))
 */


public class Person {
    private String name;
    protected int age;
    private String address;



    public Person (String name, int age, String address) {
        this.setName ( name );
        this.setAge ( age );
        this.setAddress ( address );
    }

    public Person(String name){
        this.setName ( name );

    }


    public String getName() {


        return name;
    }


    public String getAddress() {
        return address;
    }

    public void setName(String name) {

        this.name = name;
    }

      public void setAge(int age) {

        this.age = age;
    }

     public void setAddress(String address) {

        this.address = address;
    }


}

