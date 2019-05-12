package test.repositoryTest;

import model.accomodation.Room;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import repository.RoomRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class  RoomRepositoryTest {

    private static RoomRepository roomRepository;

    @BeforeAll
    static void setup() {
        roomRepository = new RoomRepository ();
    }


    @Test
    void should_add_room_if_not_zero() {
        Room room1 = new Room();
        room1.setNumber (5);
        boolean response = roomRepository.add(room1);
        assertNotNull(response);
    }

    @Test
     void should_remove_room() {
        List <Room> roomRepository = new ArrayList<> (  );
        Room room1 = new Room();
        room1.setNumber ( 6 );
        roomRepository.add ( room1 );
        roomRepository.remove ( room1 );
        assertEquals ( roomRepository.size(), 0 );



    }
}
