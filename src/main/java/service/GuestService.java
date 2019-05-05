package service;

import org.apache.log4j.Logger;
import repository.GuestRepository;

public class GuestService {
    private static Logger logger = Logger.getLogger ( "GuestService" );

    private GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }
}

