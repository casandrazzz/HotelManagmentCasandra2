/**
 *  Contains List and add/remove methods
 *  TODO to implement IRepository
 */

package repository;

import model.accomodation.Room;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoomRepository implements IRoom {


    private Logger logger = Logger.getLogger ( "Room Repository" );

    private List<Room> rooms = new ArrayList<> ();

    @Override
    public List<Room> listRooms() {
        return Collections.emptyList ();
    }

    @Override
    public boolean add(Room room) {
        if (room !=null){
            logger.log ( Level.DEBUG,"Room added successfully");
            return true;
        }
        else{
            logger.log (Level.DEBUG,"Failed to add room");
            return false;
        }
    }

    @Override
    public void remove(Room room) {
        logger.log (Level.DEBUG,"Room removed");

    }

    public List<Room> getRooms() {
        return this.rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }


}
