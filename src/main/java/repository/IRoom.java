/**
 * Contains List, add and remove methods
 * TODO to implement IRepository, to update List, to put more logic into add/remove methods
 *
 */

package repository;

import model.accomodation.Room;

import java.util.List;

public interface IRoom {

    List<Room> listRooms();


    boolean add(Room room);

    void remove(Room room);


}
