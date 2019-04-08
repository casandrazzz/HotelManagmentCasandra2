package person;

/**
 * Person is abstract class. Contains name, age, address.
 * Contains method Interaction, Pay and DateBetweenDays (to calculate the duration of booking a room))
 */


import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

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
    public abstract void Pay();
    public int DaysBetweenDates(String checkIn, String checkOut)throws ParseException {
        DateFormat date = DateFormat.getDateInstance ();
        Date dateStart = date.parse ( checkIn );
        Date dateEnd = date.parse ( checkOut );

        Calendar dayStart = Calendar.getInstance ();
        Calendar dayEnd = Calendar.getInstance ();

        dayStart.setTime ( dateStart );
        dayEnd.setTime ( dateEnd );

        int days = dayStart.get(Calendar.DAY_OF_YEAR) - dayEnd.get(Calendar.DAY_OF_YEAR);
        return days;
    }


    }