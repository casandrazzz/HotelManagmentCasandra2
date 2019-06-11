package threads;

import model.accomodation.Room;
import model.commercial.Hotel;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


import java.util.Vector;
import java.util.stream.IntStream;

public class ThreadMain {
    public static void main(String[] args) {

        final Logger logger = Logger.getLogger("ThreadMain");
        Vector<Room> hotelRooms = new Vector<>();

        IntStream.range(1, 35).forEach(n -> {
            Room room1 = new Room(n, "SINGLE");
            hotelRooms.add(room1);
            logger.log(Level.INFO, room1.getNumber() + " is a  " + room1.getType() + " , Price: " + room1.getPrice());

        });
        IntStream.range(36, 66).forEach(n -> {
            Room room2 = new Room(n, "DOUBLE");
            hotelRooms.add(room2);
            logger.log(Level.INFO, room2.getNumber() + " is " + room2.getType() + ", Price: " + room2.getPrice());

        });

        IntStream.range(67, 100).forEach(n -> {
            Room room3 = new Room(n, "APARTMENT");
            hotelRooms.add(room3);
            logger.log(Level.INFO, room3.getNumber() + " is " + room3.getType());

        });


        Hotel hotel = new Hotel.Builder()
                .hotelRooms(hotelRooms)
                .name("Flor")
                .build();

        System.out.println(hotel.getName() + hotelRooms.size());

        StatisticsThread statisticsThread = new StatisticsThread("Statistics");
        statisticsThread.start();
        statisticsThread.run();
        statisticsThread.displayStatistics();

        CheckInData checkInData = new CheckInData();
        Runnable clientThread = new ClientThread(hotel, checkInData);
        clientThread.run();
        Runnable clientThread2 = new ClientThread(hotel, checkInData);
        clientThread2.run();





        // create hotel
        Runnable hotelThread = new Runnable() {
            @Override
            public void run() {

                while  (true) {



                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        hotelThread.run();



    }
}
