package model.commercial;
import model.enums.Games;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.apache.log4j.Level.ERROR;
import static org.apache.log4j.Level.INFO;

public class Casino implements Establishment, LanguageVersion  {


    private static Logger logger = Logger.getLogger ( "Casino Class" );
    private final int MINIMUM_AGE = 18;
    private Games games;

    public Casino(Games games) {
        this.games = games;
    }

    @Override
    public void defineEstablishmentType() {
        logger.log ( INFO, "This is a Casino" );
        logger.log ( INFO, "Persons under " + MINIMUM_AGE + "are not allowed" );

    }

    @Override
    public void displayEstablishmentLocation() {
        logger.log ( INFO, "Casino is located near the hotel" );

    }

    @Override
    public void displayEstablishmentWorkingHours() {
        logger.log ( INFO, "We are opened nonstop" );

    }

    /**
     * presentGames presents games in th Casino and the conditions to enter.
     * To do: a check for user input if age is > 18; if yes access granted, else access denied.
     * Or to check Guests' age. Make a list with guests that are allowed in the casino.
     * Also check minimum amount of money to enter the casino.
     */

    @Override
    public void displayLanguage() throws IOException {
        try (FileReader file = new FileReader ( "C:\\Users\\Zzzz\\Supported_languages.txt" )) {
            try (BufferedReader fileInput = new BufferedReader ( file )) {
                String line;
                while ((line = fileInput.readLine ()) != null) {
                    logger.log ( INFO, line );
                }
            }
        } catch (FileNotFoundException e) {
            logger.log ( ERROR, e );
        }


    }
    public void presentGames() {

        logger.log ( INFO, "Here are our games. " + " You have to be at least " + MINIMUM_AGE + " to enter" );
        logger.log ( INFO, "Enter your age" );



        switch (games) {
            case SLOT_MACHINE:
                logger.log ( INFO, "Standard layout of a slot machine is a display with three or more reels which rotate when a lever is pulled or button pushed" );


            case KENO:
                logger.log ( INFO, "Keno is a lottery-like gambling game" );


            case BINGO:
                logger.log ( INFO, "Bingo is a game that uses a printed ticket of 15 numbers" );


            case BLACKJACK:
                logger.log ( INFO, "Blackjack is a comparing card game between usually several players and a dealer" );


            case SPANISH_21:
                logger.log ( INFO, "Spanish 21 is a blackjack variant" );


            case VIDEO_POKER:
                logger.log ( INFO, "Video poker is a game based on five-card draw poker" );
                break;
        }
        logger.log ( INFO, "All games are fun" );
    }







   /* @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", staff=" + staff +
                '}';
    }*/


}


