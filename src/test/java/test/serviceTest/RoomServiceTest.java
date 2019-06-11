package test.serviceTest;

import model.accomodation.Room;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.RoomRepository;
import service.RoomService;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@ExtendWith(MockitoExtension.class)
class RoomServiceTest {
    @Mock
    private static RoomRepository roomRepository;

    @BeforeAll
    static void setup() {
        RoomService roomService = new RoomService(roomRepository);
    }

    @Test
    void should_setPrice_100_for_Rooms_withNumber_lessThan_33() {

        int roomNumber = 1;
        Room room = null;
        while (roomNumber < 33) {
            room = new Room (5, "SINGLE");
            room.setPrice ( 100 );
            roomRepository.add ( room );
            roomNumber++;

        }

        Mockito.verify ( roomRepository, times ( 1 ) ).add ( room );
        assertEquals ( 100, room.getPrice () );
    }
    @Test
    void should_setRoom_isNotOccupied_for_Rooms_withNumber_between_34_and_63(){

        IntStream.range ( 34, 63 ).forEach ( n -> {
            Room room1 = new Room (n, "SINGLE");
            room1.setNumber ( n );
            room1.setOccupied ( false );
            assertFalse ( room1.isOccupied () );

        } );
    }
    @Deprecated
    @Test
    void should_setRoom_isCleaned_for_Rooms_withNumber_between_15_and_33(){

        IntStream.range ( 15, 33 ).forEach ( n -> {
            Room room1 = new Room (n , "SINGLE");
            room1.setNumber ( n );



        } );



    }

}
