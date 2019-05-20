package repository;

import model.people.Guest;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class GuestRepository implements IGuest {

    private Set<Guest> guestsSet = new HashSet<>();
    private Logger logger = Logger.getLogger ( "Guest Repository " );


    @Override
    public Set<Guest> guestsSet() {
        return guestsSet;
    }

    @Override
    public boolean add(Guest guest) {
        if (guest !=null){

            guestsSet.add(guest);
            logger.log ( Level.INFO,"Guest added successfully");
            return true;
        }
        else{
            logger.log (Level.INFO,"Failed to add guest");
            return false;
        }
    }


    @Override
    public void remove(Guest guest) {

        guestsSet.remove ( guest );
        logger.log (Level.INFO, "Guest removed" );

    }
}
