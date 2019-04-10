package person;

/**
 * Person is abstract class. Contains name, age, address.
 * Contains method Interaction, Pay and DateBetweenDays (to calculate the duration of booking a room))
 */


public abstract class Person {
    private String name;
    private int age;
    private String address;
    private String Period;


      public Person (String name, int age, String address) {
        this.setName ( name );
        this.setAge ( age );
        this.setAddress ( address );
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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

    public abstract void interactions();

    public abstract int pay(int days, int price);
}