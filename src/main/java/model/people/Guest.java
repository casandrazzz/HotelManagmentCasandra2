package model.people;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)

public class Guest extends Person implements Serializable {
    public static final String CLIENT_TYPE_GOLD = "GOLD";
    public static final String CLIENT_TYPE_SILVER = "SILVER";

    public static int nightsOfStay;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String preference;
    private int stays;
    private String reasonForStay;
    private String clientType;
    private int id;


    private Logger logger = Logger.getLogger ( "Guest" );


    public Guest(String personName, int age, String personAddress) {

        super ( personName, age, personAddress );
    }

    public Guest() {
    }


    public void interactions() {

        logger.log ( Level.INFO, "Hello, I would like to book a room." );

    }

    public static class Builder extends Guest {

        private int id;
        private String name;
        private int stays;
        private LocalDate checkInDate;

        public Builder(String personName, int age, String personAddress) {
            super(personName, age, personAddress);
        }

        public Builder id(int id) {
            this.id = id;

            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder stays(int stays) {
            this.stays =stays;
            return this;
        }

        public Builder checkIn(LocalDate checkIn) {
            this.checkInDate =checkInDate;
            return this;
        }

        public Guest build() {

            Guest guest = new Guest();
            guest.setId(this.id);
            guest.setName(this.name);
            guest.setStays(this.stays);

            return guest;
        }
    }


    public void setNightsOfStay(int nightsOfStay) {
        Guest.nightsOfStay = nightsOfStay;
    }


   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass () != o.getClass ()) return false;

        Guest that = (Guest) o;

        if (Guest.super.age != that.age) return false;
        if (name != null ? !name.equals ( that.name ) : that.name != null) return false;
        if (address != that.address) return false;
        if (id !=that.id) return false;
        return this.getId() == ((Guest) o).getId();

    }*/


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Guest))
            return false;
        if (obj == this)
            return true;
        return this.getId() == ((Guest) obj).getId();
    }

    @Override
    public int hashCode(){
        return id;
    }


}





