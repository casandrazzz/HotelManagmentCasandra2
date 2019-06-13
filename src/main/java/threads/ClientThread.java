package threads;

import lombok.Getter;
import lombok.Setter;
import model.accomodation.Room;
import model.commercial.Hotel;

import java.util.Random;
import java.util.Vector;


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



        Vector<Room> hotelRooms = this.hotel.getHotelRooms();


     //   IntStream.range(1, 5).forEach(n -> {
       //     Room room1 = new Room(n, "SINGLE");
         //   hotelRooms.add(room1);

       // });
       // IntStream.range(6, 10).forEach(n -> {
         //   Room room2 = new Room(n, "DOUBLE");
           // hotelRooms.add(room2);


        //});

        //IntStream.range(11,17 ).forEach(n -> {
          //  Room room3 = new Room(n, "APARTMENT");
            //hotelRooms.add(room3);


        //});



        new Thread(() ->{
            for (int n = 1; n<10; n++)
                synchronized (hotelRooms) {
                    Room room2 = new Room(n, "DOUBLE");
                    Room room3 = new Room(n, "APARTMENT");
                    room3.setOccupied(true);
                    hotelRooms.add(room2);
                    hotelRooms.add(room3);
                    System.out.println("Produced: " + room3 + Thread.currentThread());
                    System.out.println("List content: " + hotelRooms);
                    System.out.println("Room booked from " + getCheckInData());

                }


                try {
                    Thread.sleep(6000 + new Random().nextInt(18));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }




              //  long endTime = System.currentTimeMillis();
              //  long difference = endTime - startTime;
              //  System.out.println("Duration Thread " + Thread.currentThread().getName() + ": " + difference);
            }).start();
        }


}




