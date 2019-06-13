/*
  Contains logic for interacting with the client
  TODO to add methods for hiring staff and necessary validation
 */

package service;

import exceptions.InputValidation;
import model.accomodation.*;
import org.apache.log4j.Logger;
import repository.StaffRepository;

import java.util.Scanner;

import static model.people.Guest.nightsOfStay;
import static org.apache.log4j.Level.INFO;

class StaffService {

    private static final StaffRepository staff = new StaffRepository();
    private static final Logger logger = Logger.getLogger("StaffService");

    public static void interactions() {

        logger.log(INFO, "Please press 1 for STANDARD,2 for DOUBLE, 3 for APARTMENT OR 4 for PENTHOUSE...");
        double totalCost;


        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        logger.log(INFO, n);


        if (n == 0) {
            try {

                throw new InputValidation();

            } catch (InputValidation inputValidation) {
                inputValidation.printStackTrace();
            }
            logger.log(INFO, "Enter an option that is between 1 and 4...");
            reader = new Scanner(System.in);
            n = reader.nextInt();

        }


        if (n > 4) {
            try {

                throw new InputValidation();

            } catch (InputValidation inputValidation) {
                inputValidation.printStackTrace();
            }
            logger.log(INFO, "Enter an option that is between 1 and 4...");
            reader = new Scanner(System.in);
            n = reader.nextInt();

        }

        logger.log(INFO, "How many nights would you like to stay");

        reader = new Scanner(System.in);
        int nightsOfStay = reader.nextInt();

        int costOfStay = nightsOfStay * Room.price;

        while (nightsOfStay == 0) {
            try {
                Room.price = costOfStay / nightsOfStay;

            } catch (ArithmeticException a) {
                logger.log(INFO, "Please enter a value that is not zero");


            }
            reader = new Scanner(System.in);
            nightsOfStay = reader.nextInt();

        }

        if (n == 1) {
            totalCost = StandardRoom.price * nightsOfStay;
            logger.log(INFO, totalCost);
        } else if (n == 2) {
            totalCost = DoubleRoom.price * nightsOfStay;
            logger.log(INFO, totalCost);
        } else if (n == 3) {
            totalCost = Apartment.price * nightsOfStay;
            logger.log(INFO, totalCost);
        } else if (n == 4) {
            totalCost = Penthouse.price * nightsOfStay;
            logger.log(INFO, totalCost);
        }

    }


    public static void hireAndValidateStaff() {


    }

    public static void presentOffer() {

        logger.log(INFO, "For at least 5 days at our hotel you can get 50% discount");
        logger.log(INFO, "Enter the number of nights you would like to stay...");
        Scanner reader = new Scanner(System.in);
        nightsOfStay = reader.nextInt();


        if ((nightsOfStay >= 5)) {
            logger.log(INFO, "Discount applies for" + nightsOfStay + "nights of stay");
        } else {
            logger.log(INFO, "Discount does not apply");


        }

    }

    @Override
    public String toString() {
        return "Employees{" + "Staff=" + staff;
    }


}

