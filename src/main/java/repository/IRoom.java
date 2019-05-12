package repository;

import model.accomodation.Room;

import java.util.List;

public interface IRoom {

    List<Room> listRooms();


    boolean add(Room room);

    void remove(Room room);


}
