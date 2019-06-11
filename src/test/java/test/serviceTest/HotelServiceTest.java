package test.serviceTest;


import model.commercial.Hotel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.HotelRepository;
import service.HotelService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

/* Base configuration (parent) class for JUnit 5, for Unit tests.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("Hotel Service Test")
class HotelServiceTest {
    @Mock
    private static HotelRepository hotelRepository;

    private static HotelService hotelService;

    @BeforeAll
    static void setup() {
        hotelService = new HotelService ( hotelRepository );


    }

    @Test
    void should_notAddHotel_whenName_isLongerThan50char() {
        Hotel hotel = new Hotel ();
        hotel.setName ( "45678955555555555555555555555555555555555555555555555555555555555" );
        Mockito.lenient ().when ( hotelRepository.add ( any ( Hotel.class ) ) ).thenReturn ( false );
        //   doReturn(false).when(hotelRepository).add(any(Hotel.class));
        String response = hotelService.validateAndAddHotels ( hotel );
        assertEquals ( "Please enter a name that has maximum 50 characters", response );
    }

    @Test
    void should_notAddHotel_whenName_isEmpty() {
        Hotel hotel = new Hotel ();
        hotel.setName ( "" );
        Mockito.lenient ().when ( hotelRepository.add ( any ( Hotel.class ) ) ).thenReturn ( false );
        //   doReturn(false).when(hotelRepository).add(any(Hotel.class));
        String response = hotelService.validateAndAddHotels ( hotel );
        assertEquals ( "EMPTY", response );
    }

    @Test
    void should_notAddHotel_whenName_isNull() {
        Hotel hotel = new Hotel ();
        hotel.setName ( null );
        Mockito.lenient ().when ( hotelRepository.add ( any ( Hotel.class ) ) ).thenReturn ( false );
        //   doReturn(false).when(hotelRepository).add(any(Hotel.class));
        String response = hotelService.validateAndAddHotels ( hotel );
        assertEquals ( "NULL OBJECT", response );
    }


}
