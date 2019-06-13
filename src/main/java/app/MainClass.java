package app;

import model.commercial.Casino;
import model.commercial.EstablishmentData;
import model.commercial.Hotel;
import model.enums.Games;
import model.people.Gambler;
import model.people.Guest;
import model.people.Staff;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import repository.GuestRepository;
import repository.HotelRepository;
import repository.StaffRepository;
import service.GuestService;
import service.HotelService;
import service.RoomService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class MainClass {

    private static final Logger logger = Logger.getLogger("Main");
    private static final Set<Guest> guestsSet = new HashSet<>();


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        logger.info("INFO");


        Hotel hotel = new Hotel();
        hotel.defineEstablishmentType();
        hotel.displayEstablishmentLocation();
        hotel.displayEstablishmentWorkingHours();
        EstablishmentData.mapEstablishmentData();
        HotelService.builderPattern();

        logger.log(Level.INFO, Constants.WELCOME_MESSAGE);
        logger.log(Level.INFO, Constants.CALL_CENTER);


        StaffRepository staff = new StaffRepository();
        GuestRepository guests = new GuestRepository();

        Staff receptionist = new Staff("Annie", 25, "South");
        Staff hostess = new Staff("Jane", 28, "East");
        Staff valet = new Staff("Richard", 40, "North");
        Staff maid = new Staff("Chris", 35, "West");
        Staff accountant = new Staff("Fineas", 25, "Madrid");
        accountant.setJobDescription("Prepare balance sheets, profit and loss statements and other financial reports");
        receptionist.setJobDescription("Receive visitors at the front desk by greeting, welcoming, directing and announcing them appropriately");
        hostess.setJobDescription("Present a positive first impression of the establishment's friendliness, excellent service and high standards");
        valet.setJobDescription("Stand in front of the establishment, get key from the drivers, help with any luggage");
        maid.setJobDescription("Clean and tidy all areas to the standard cleanliness within time limits");
        staff.add(receptionist);
        staff.add(hostess);
        staff.add(valet);
        staff.add(maid);
        staff.add(accountant);
        logger.log(Level.INFO, "Meet " + staff + ".");
        List<Staff>  appraisalsList = Arrays.asList(accountant, hostess);

        boolean isFoundOnAppraisalList = appraisalsList.stream()
                .anyMatch(element -> element.getJobDescription().contains("Prepare"));
        logger.log(Level.INFO, isFoundOnAppraisalList);


        //StaffService.interactions();
        //StaffService.presentOffer();


        Guest guest21;


        guest21 = new Guest("James", 25, "Kansas");
        guest21.setPreference("DOUBLE");
        guest21.interactions();
        guest21.setCheckInDate(LocalDate.of(2019, 5, 25));
        guest21.setReasonForStay("Business");
        boolean first = guestsSet.add(guest21);
        logger.log(Level.INFO, first);
        boolean second = guestsSet.add(guest21);
        logger.log(Level.INFO, second);


        // new DoubleRoom();
        //calculateCost();
        // logger.log(Level.INFO, calculateCost());

        Guest guest22;
        guest22 = new Guest("Gina", 25, "Colorado");
        guest22.setPreference("PENTHOUSE");
        guest22.interactions();
        guest22.setCheckInDate(LocalDate.of(2019, 6, 23));
        guest22.setNightsOfStay(3);
        first = guestsSet.add(guest22);
        logger.log(Level.INFO, first);
        second = guestsSet.add(guest22);
        logger.log(Level.INFO, second);
       List filtered = guestsSet.stream()
                .filter(guest -> guest.getName().contains("Gina"))
                .map(Guest::getStays)
                .collect(Collectors.toList());
       logger.log(Level.INFO, filtered);

        // Apartment penthouse = new Penthouse();
        // Apartment.calculateCost();
        // logger.log(Level.INFO, penthouse.getPrice());
        //logger.log(Level.INFO, Apartment.calculateCost());

        for (Guest guest : guests.guestsSet()) {
            logger.log(Level.INFO, guest + ".");
        }

        //logger.log(Level.INFO, "I am " + guest21.getName() + "." + " I am from " + guest21.getAddress() + " I'd like a " + guest21.getPreference() + " room");

        RoomService.displayApartmentPrice(); //Optional si max
        //RoomService.createRooms();
        RoomService.sortRooms();


        Casino casino = new Casino(Games.SLOT_MACHINE);
        //casino.defineEstablishmentType();
        //casino.displayEstablishmentLocation();
        //casino.displayEstablishmentWorkingHours();
        //casino.presentGames();
        //casino.displayLanguage();

        Gambler gambler = new Gambler("Bruce", 28, "Florida", 200);
        //gambler.checkMinimumAge();

        Hotel hotelA = new Hotel();
        Hotel hotelB = new Hotel();


        HotelRepository hotelRepository = new HotelRepository();
        HotelService hotelService = new HotelService(hotelRepository);
        hotelService.validateAndAddHotels(hotelA);
        hotelService.validateAndAddHotels(hotelB);
        hotelA.setName("Majestic");
        hotelB.setName("a1a2a3a4a5a6a7a8a9a1a2a3a4a5a6a7a8a9a1a2a3a4a5a6a7a8a9a1a2a3a4a5a6a7a8a9");
        logger.log(Level.INFO, hotelA.getName() + hotelService.validateAndAddHotels(hotelA));
        logger.log(Level.INFO, hotelB.getName() + hotelService.validateAndAddHotels(hotelB));
        //logger.log(Level.INFO, hotelB.getName() + hotelService.delete(hotelB));

        //GuestService.readLoyaltyStatus();
        //GuestService.readRules();
       // try {
           // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           // Date checkIn = sdf.parse("2019-05-02");
           // Date checkOut = sdf.parse("2019-05-23");
           // guest21.setCheckInDate(LocalDate.of(2019, 5, 23));
           // guest21.setCheckOutDate(LocalDate.of(2019, 8,27));
           // logger.log(Level.INFO, "This is my check in date " + );
           // logger.log(Level.INFO, "This is my check out date " + checkOut);
       // } catch (ParseException e) {
        //    logger.log(Level.ERROR, e);

       // }

        GuestService.builderPattern();
        logger.log(Level.INFO, guestsSet.size());
        Gambler.winSomeLoseSome(Collections.singletonList(5));
        RoomService.confirmSelection();


    }



    }





















