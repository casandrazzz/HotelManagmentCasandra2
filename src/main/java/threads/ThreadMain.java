package threads;

import model.accomodation.Room;
import model.commercial.Hotel;
import org.apache.log4j.Logger;

import java.util.Vector;

public class ThreadMain {
    public static void main(String[] args) {

        final Logger logger = Logger.getLogger("ThreadMain");
        Vector<Room> hotelRooms = new Vector<>();


        Hotel hotel = new Hotel.Builder()
                .hotelRooms(hotelRooms)
                .name("Flor")
                .build();

        System.out.println(hotel.getName() + hotelRooms.size());


        CheckInData checkInData = new CheckInData();
        Runnable clientThread = new ClientThread(hotel, checkInData);
        clientThread.run();
        Runnable clientThread2 = new ClientThread(hotel, checkInData);
        clientThread2.run();
        StatisticsThread statisticsThread = new StatisticsThread("Statistics", hotelRooms);
        statisticsThread.start();
        statisticsThread.run();
        statisticsThread.displayStatistics();


        // create hotel


    }
}
