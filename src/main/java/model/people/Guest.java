package model.people;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)

public class Guest extends Person implements Serializable {
    public static final String CLIENT_TYPE_GOLD = "GOLD";
    public static final String CLIENT_TYPE_SILVER = "SILVER";

    public static int nightsOfStay;
    private Date checkInDate;
    private Date checkOutDate;
    private String preference;
    private int stays;
    private String reasonForStay;
    private String clientType;

    private Logger logger = Logger.getLogger ( "Guest" );


    public Guest(String personName, int age, String personAddress) {

        super ( personName, age, personAddress );
    }

    public Guest(String token, String token1, String token2) {
    }

    public Guest() {

    }


    public void interactions() {

        logger.log ( Level.INFO, "Hello, I would like to book a room." );

    }


    public void setNightsOfStay(int nightsOfStay) {
        this.nightsOfStay = nightsOfStay;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass () != o.getClass ()) return false;

        Guest that = (Guest) o;

        if (Guest.super.age != that.age) return false;
        if (name != null ? !name.equals ( that.name ) : that.name != null) return false;
        if (address != that.address) return false;
        return clientType != null ? clientType.equals ( that.clientType ) : that.clientType == null;
    }


}





