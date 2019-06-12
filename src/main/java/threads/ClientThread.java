package threads;

import lombok.Getter;
import lombok.Setter;
import model.accomodation.Room;
import model.commercial.Hotel;

import java.util.Vector;
import java.util.stream.IntStream;


@Setter
@Getter


public class ClientThread implements Runnable {

    private Hotel hotel;
    private CheckInData checkInData;
    private Thread t;

    ClientThread(Hotel hotel, CheckInData checkInData) {

        this.hotel = hotel;
        this.checkInData = checkInData;

        t = new Thread(this);

        System.out.println("New thread: " + t);
        t.start();


    }


    @Override
    public void run() {

        long startTime = System.currentTimeMillis();


        // lock rooms from Hotel (? maybe sync)

        // get Rooms
        Vector<Room> hotelRooms = this.hotel.getHotelRooms();
        Vector<Room> toRemove = new Vector<>();
        new Thread(() ->{
            synchronized (hotelRooms){

                IntStream.range(1, 35).forEach(n -> {
                    Room room1 = new Room(n, "SINGLE");
                    hotelRooms.add(room1);
                    //   logger.log(Level.INFO, room1.getNumber() + " is a  " + room1.getType() + " , Price: " + room1.getPrice());

                });
                IntStream.range(36, 66).forEach(n -> {
                    Room room2 = new Room(n, "DOUBLE");
                    hotelRooms.add(room2);
                    // logger.log(Level.INFO, room2.getNumber() + " is " + room2.getType() + ", Price: " + room2.getPrice());

                });

                IntStream.range(67, 100).forEach(n -> {
                    Room room3 = new Room(n, "APARTMENT");
                    hotelRooms.add(room3);
                    //logger.log(Level.INFO, room3.getNumber() + " is " + room3.getType());

                });


            }

                for (Room room : hotelRooms) {
                    if (!room.isOccupied()) {
                        room.setOccupied(true);
                        toRemove.add(room);
                        System.out.println("Room " + room.getNumber() + " booked from " + getCheckInData());
                        // System.out.println("Number of occupied rooms is " + occupiedRooms.size());
                    }
                }
                hotelRooms.removeAll(toRemove);


                // find empty room - done

                // mark room as booked - done


                //for (int i = 1; i <= 5; i++) {

                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    //  }


                }

                long endTime = System.currentTimeMillis();
                long difference = endTime - startTime;
                System.out.println("Duration Thread " + Thread.currentThread().getName() + ": " + difference);
            }).start();
        }
}




