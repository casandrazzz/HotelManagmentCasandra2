package person;


public abstract class Person {
    public String name;
    public int age;
    public String address;


      public Person() {
        this.setName ( name );
        this.setAge ( age );
        this.setAddress ( address );
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

    public abstract void Interactions();

}
