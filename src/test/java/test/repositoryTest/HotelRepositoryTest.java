package test.repositoryTest;

import model.commercial.Hotel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import repository.HotelRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotelRepositoryTest {

    private static HotelRepository hotelRepository;

    @BeforeAll
    static void setup() {
        hotelRepository = new HotelRepository ();
    }

    @Test
    void should_AddHotel_ForValidData() {

        Hotel hotel = new Hotel ();
        hotel.setName ( "Golden Tulip" );
        hotel.setAddress ( "Frunzisului 104" );

        boolean response = hotelRepository.add ( hotel );

        assertTrue ( response );
    }

    @Test
    void shouldNot_AddHotel_ForInvalidData() {

        Hotel hotel = new Hotel ();
        hotel.setName ( null );

        boolean response = hotelRepository.add ( null );

        assertFalse ( response );


    }


    @Test
    void should_remove_hotel() {
        List<Hotel> hotel = new ArrayList<> ();
        Hotel hotel1 = new Hotel ();
        hotel1.setName ( "Art" );
        hotelRepository.add ( hotel1 );
        hotelRepository.remove ( hotel1 );
        assertEquals ( hotel.size (), 0 );
    }
}

