package threads;

import model.accomodation.Room;

import java.util.Vector;

public class StatisticsThread extends Thread {

   // private LinkedList<String> list;

    //public StatisticsThread(LinkedList<String> list) {

    //    this.list = list;
    //}
    Vector<Room> hotelRooms = new Vector<>();

    StatisticsThread(String threadName) {

        Thread statistics = new Thread(this, threadName);

        System.out.println("Statistics thread: " + statistics);}

        void displayStatistics() {

            new Thread(() -> {
                while (true) try {
                     {
                        System.out.println("Statistics:" + hotelRooms);
                        hotelRooms.stream()
                                .findFirst()
                                .filter(room -> room.getType().contains("SINGLE"))
                                .map(Room::getNumber);
                        System.out.println(hotelRooms);


                    }
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }}



