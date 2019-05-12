package repository;

import model.people.Guest;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class GuestRepository implements IGuest {

    private List<Guest> guests = new ArrayList<> ();
    private Logger logger = Logger.getLogger ( "Guest Repository " );

    @Override
    public List<Guest> listGuest() {
        return null;
    }

    @Override
    public boolean add(Guest guest) {
        if (guest !=null){

            guests.add(guest);
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

        guests.remove ( guest );
        logger.log (Level.INFO, "Guest removed" );

    }


}
