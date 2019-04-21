package test;


import model.Hotel;
import model.Responses;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.HotelRepository;
import service.HotelService;

import java.util.List;

import static model.Responses.YES;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

/* Base configuration (parent) class for JUnit 5, for Unit tests.
 */
@ExtendWith ( MockitoExtension.class )

public class HotelServiceTest {
    @Mock
    private static HotelRepository hotelRepository;

    private static HotelService hotelService;

    @BeforeAll
    static void setup(){
        hotelService = new HotelService ( hotelRepository );
    }

    @Test
    public void should_ValidateAndAddHotel(){
        Hotel hotel = new Hotel ();
        hotel.setName ( "45678955555555555555555555555555555555555555555555555555555555555" );

//        doReturn(false).when(hotelRepository).add(any(Hotel.class)); cu linia asta nu merge
        String  response = hotelService.validateAndAddHotels (hotel);
        assertEquals("Please enter a name that has maximum 50 characters", response);
    }

    @Test
    public void should_RemoveHotel_whenAnswer_isYes(){
        Hotel hotel1 = new Hotel ();
        hotel1.setName ( "Lucky" );
        hotelRepository.add(hotel1);
        Responses responses = YES;
        if (responses == YES){
            hotelRepository.remove(hotel1);
        }
        System.out.println ();

    }


}
