package test;
import model.Hotel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import repository.HotelRepository;
import service.HotelService;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@RunWith ( MockitoJUnitRunner.class )

public class HotelServiceTest {

    @Mock
    public HotelRepository hotelRepository;

    public HotelService hotelService;

    @Before
    public void setup(){
        hotelService = new HotelService ( hotelRepository );
    }

    @Test
    public void should_ValidateAndAddHotel(){
        Hotel hotel = new Hotel ();
        hotel.setName ( "123456789123456789123456789123456789123456789123456789" );

        doReturn(false).when(hotelRepository).add(any(Hotel.class));
        String response = hotelService.validateAndAddHotels ( hotel );
        assertEquals("Hotel was not added successfully", response);
    }


}
