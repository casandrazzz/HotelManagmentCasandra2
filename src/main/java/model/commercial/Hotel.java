package model.commercial;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import model.accomodation.Room;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.*;

/**
 * Hotel has a list of rooms and a list of staff, name and address;
 */

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Hotel implements Establishment, LanguageVersion {
    private UUID randomID;
    public  String name;
    private String address;
    private int MINIMUM_ROOMS = 5;
    public  List<Room> rooms = new ArrayList<>();
    private Map<UUID, List> hotelMap = new HashMap<>();



    private Logger logger = Logger.getLogger ( "Establishment" );




    @Override
    public void defineEstablishmentType() {


        String establishmentType = "Hotel";

        logger.log ( Level.INFO, establishmentType);

    }

    @Override
    public void displayEstablishmentLocation() {

        String establishmentLocation = "Urban";

        logger.log (Level.INFO, establishmentLocation );

    }

    @Override
    public void displayEstablishmentWorkingHours() {

        String establishmentWorkingHours = "Nonstop";

        logger.log (Level.INFO, establishmentWorkingHours );

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static class Builder extends Hotel {
        private UUID randomID;
        private String name;
        private String address;
        private List<Room> rooms = new ArrayList<>();





        public Builder randomID(UUID randomID) {
            this.randomID = randomID;

            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address =address;
            return this;
        }

        public Builder rooms(List<Room> rooms) {
            this.rooms =rooms;
            return this;
        }


        public Hotel build() {

            Hotel hotel = new Hotel();
            hotel.setRandomID(this.randomID);
            hotel.setName(this.name);
            hotel.setAddress(this.address);
            hotel.setRooms(this.rooms);

            return hotel;
        }
    }
}


