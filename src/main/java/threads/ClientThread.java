package threads;

import lombok.Getter;
import lombok.Setter;
import model.accomodation.Room;
import model.commercial.Hotel;

import java.util.List;


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
        List<Room> hotelRooms = this.hotel.getHotelRooms();


        for (Room room : hotelRooms) {
            if (!room.isOccupied()) {
                room.setOccupied(true);
                System.err.println("Room " + room.getNumber() + " booked from " + getCheckInData());
                // System.out.println("Number of occupied rooms is " + occupiedRooms.size());
            }
        }
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
    }
}




