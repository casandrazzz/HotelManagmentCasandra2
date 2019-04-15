package person;

public class Gambler extends Guest {
    private final int MINIMUM_AGE = 18;
    private final int MINIMUM_CASH = 500;

    public Gambler(String personName, int age, String personAddress) {
        super ( personName, age, personAddress );
    }
}
