package threads;

import lombok.Getter;
import lombok.Setter;
import model.accomodation.Room;
import model.commercial.Hotel;

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
                        System.out.println("Statistics:" + hotelRooms);
                        hotelRooms.stream()
                                .findFirst()
                                .filter(room -> room.getType().contains("SINGLE"))
                                .map(Room::getNumber);

                       // System.out.println(hotelRooms);


                    }
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }}



