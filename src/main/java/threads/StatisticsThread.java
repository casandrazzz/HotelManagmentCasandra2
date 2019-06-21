package threads;

import lombok.Getter;
import lombok.Setter;
import model.accomodation.Room;
import model.commercial.Hotel;

import java.util.ArrayList;
import java.util.Vector;

@Getter
@Setter
public class StatisticsThread extends Thread {



    private Hotel hotel;
    private Vector<Room> hotelRooms;


    StatisticsThread(String threadName, Vector<Room> hotelRooms) {

        Thread statistics = new Thread(this, threadName);
        this.hotelRooms = hotelRooms;

        System.out.println("Statistics thread: " + statistics);}




        void displayStatistics() {

            new Thread(() -> {
                while (true) try {
                     synchronized (hotelRooms)
                     {

                        hotelRooms.stream()
                                .findFirst()
                                .filter(Room::isOccupied)
                                .map(Room::getType);
                         System.out.println("Statistics:" + holdsLock(hotelRooms) + new ArrayList<>(hotelRooms));


                       // System.out.println(hotelRooms);

                         Thread.sleep(5000);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }}



