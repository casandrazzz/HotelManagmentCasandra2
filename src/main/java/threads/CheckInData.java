package threads;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

@Setter
@Getter
class CheckInData {
    private double numberOfPersons;

    LocalDate startDate = LocalDate.now() ;//start date
    long start = startDate.toEpochDay();

    LocalDate endDate = LocalDate.of(2019, 12, 31);; //end date
    long end = endDate.toEpochDay();

    long checkIn ;
   // random date between the range

    CheckInData() {
        numberOfPersons = Math.random();
        checkIn =  ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
    }

}
