package test;


import model.commercial.Hotel;
import model.enums.Responses;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.HotelRepository;
import service.HotelService;

import static model.enums.Responses.NO;
import static model.enums.Responses.YES;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

/* Base configuration (parent) class for JUnit 5, for Unit tests.
 */
@ExtendWith ( MockitoExtension.class )
@DisplayName ( "Hotel Service Test" )

public class HotelServiceTest {
    @Mock
    private static HotelRepository hotelRepository;

    private static HotelService hotelService;

    @BeforeAll
    static void setup(){
        hotelService = new HotelService ( hotelRepository );


    }

    @Test
    public void should_notAddHotel_whenName_isLongerThan50char(){
        Hotel hotel = new Hotel ();
        hotel.setName ( "45678955555555555555555555555555555555555555555555555555555555555" );
        Mockito.lenient ().when ( hotelRepository.add ( any (Hotel.class) ) ).thenReturn ( false );
     //   doReturn(false).when(hotelRepository).add(any(Hotel.class));
        String  response = hotelService.validateAndAddHotels (hotel);
        assertEquals("Please enter a name that has maximum 50 characters", response);
    }

    @Test
    public void should_notAddHotel_whenName_isEmpty(){
        Hotel hotel = new Hotel ();
        hotel.setName ( "" );
        Mockito.lenient ().when ( hotelRepository.add ( any (Hotel.class) ) ).thenReturn ( false );
        //   doReturn(false).when(hotelRepository).add(any(Hotel.class));
        String  response = hotelService.validateAndAddHotels (hotel);
        assertEquals("EMPTY", response);
    }

    @Test
    public void should_notAddHotel_whenName_isNull(){
        Hotel hotel = new Hotel ();
        hotel.setName ( null );
        Mockito.lenient ().when ( hotelRepository.add ( any (Hotel.class) ) ).thenReturn ( false );
        //   doReturn(false).when(hotelRepository).add(any(Hotel.class));
        String  response = hotelService.validateAndAddHotels (hotel);
        assertEquals("NULL OBJECT", response);
    }

    @Test
    public void should_NotRemoveHotel_whenAnswer_isNo(){
        Hotel hotel1 = new Hotel ();
        hotel1.setName ( "Storm" );
        hotelRepository.add(hotel1);
        Responses responses = NO;
        if (responses == NO){
            System.out.println (responses.getMessage ());
        }
            hotelRepository.remove(hotel1);
        }



    @Test
    public void should_RemoveHotel_whenAnswer_isYes(){
        Hotel hotel1 = new Hotel ();
        hotel1.setName ( "Storm" );
        hotelRepository.add(hotel1);
        Responses responses = YES;
        if (responses == YES){
            System.out.println (responses.getMessage ());
            hotelRepository.remove(hotel1);
        }





    }


}
