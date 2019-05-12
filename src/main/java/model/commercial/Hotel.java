package model.commercial;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Hotel has a list of rooms and a list of staff, name and address;
 */

@Getter
@Setter
@NoArgsConstructor

public class Hotel implements Establishment, LanguageVersion {
    private String name;
    private String address;
    private int MINIMUM_ROOMS = 5;

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


}


