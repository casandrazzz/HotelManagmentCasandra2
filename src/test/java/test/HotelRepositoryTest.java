package test;

import model.Hotel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import repository.HotelRepository;

import static org.junit.jupiter.api.Assertions.*;

public class HotelRepositoryTest {

    private static HotelRepository hotelRepository;

    @BeforeAll
    public static void  setup() {
        hotelRepository = new HotelRepository ();
    }

    @Test
    public void should_AddHotel_ForValidData() {

        Hotel hotel = new Hotel ();
        hotel.setName ( "Golden Tulip" );
        hotel.setAddress ( "Frunzisului 106" );

        boolean response = hotelRepository.add ( hotel );

        assertEquals ( true, response  );
    }

    @Test
    public void shouldNot_AddHotel_ForInvalidData() {

        Hotel hotel = new Hotel ();
        hotel.setName ( null);

        boolean response = hotelRepository.add(null);




    }


}

