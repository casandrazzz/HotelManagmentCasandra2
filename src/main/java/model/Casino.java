package model;


public class Casino implements Establishment {


    private final int MINIMUM_AGE = 18;
    Games games;

    public Casino(Games games) {
        this.games = games;
    }

    @Override
    public void defineEstablishmentType() {
        System.out.println ( "This is a Casino" );

    }

    @Override
    public void displayEstablishmentLocation() {
        System.out.println ( "Casino is located near the hotel" );

    }

    @Override
    public void displayEstablishmentWorkingHours() {
        System.out.println ( "We are opened nonstop" );

    }

    /**
     * presentGames presents games in th Casino and the conditions to enter.
     * To do: a check for user input if age is > 18; if yes access granted, else access denied.
     * Or to check Guests' age. Make a list with guests that are allowed in the casino.
     * Also check minimum amount of money to enter the casino.
     */

    public void presentGames() {

        System.out.println ( "Here are our games. " + " You have to be at least " + MINIMUM_AGE + " to enter" );
        System.out.println ( "Enter your age" );

        switch (games) {
            case SLOT_MACHINE:
                System.out.println ( "Standard layout of a slot machine is a display with three or more reels which rotate when a lever is pulled or button pushed" );


            case KENO:
                System.out.println ( "Keno is a lottery-like gambling game" );


            case BINGO:
                System.out.println ( "Bingo is a game that uses a printed ticket of 15 numbers" );


            case BLACKJACK:
                System.out.println ( "Blackjack is a comparing card game between ussualy several players and a dealer" );


            case SPANISH_21:
                System.out.println ( "Spanish 21 is a blackjack variant" );


            case VIDEO_POKER:
                System.out.println ( "Video poker is a game based on five-card draw poker" );
                break;
        }
        System.out.println ( "All games are fun" );
    }







   /* @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", staff=" + staff +
                '}';
    }*/


}


