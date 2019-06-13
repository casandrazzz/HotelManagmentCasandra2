package test.repositoryTest;

import model.people.Guest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import repository.GuestRepository;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GuestRepositoryTest {


    private static GuestRepository guestRepository;

    @BeforeAll
    static void setup() {
        guestRepository = new GuestRepository ();
    }

    @Test
    void should_add_guest_if_not_null() {
        Guest guest = new Guest ( "Luiza", 25, "Brasil" );
        boolean response = guestRepository.add ( guest );
        assertTrue ( response );
    }

    @Test
    void should_remove_guest() {
        List<Guest> guestRepository = new ArrayList<> ();
        Guest guest = new Guest ("Chris", 31, "Spain");
        guestRepository.add ( guest );
        guestRepository.remove ( guest );
        assertEquals ( guestRepository.size (), 0 );
    }

    @Test
    void shouldNot_AddGuest_For_Null() {

        Guest guest = new Guest ();
        guest.setName ( null );

        boolean response = guestRepository.add ( null );

        assertFalse ( response );


    }

//    @Test
//    void AssertThatGuestIsInList() {
//        List<Guest> guestRepository = new ArrayList<> ();
//        Guest guest = new Guest ("Chris", 31, "Spain");
//        guestRepository.add ( guest );

//        assertThat(
//                Arrays.asList(guestRepository.contains(guest), guest.getName()));
//    }


}
