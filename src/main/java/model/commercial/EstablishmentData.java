package model.commercial;

import lombok.Getter;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter

public class EstablishmentData {

    private String name;

    private Set<String> facilities;

    private static org.apache.log4j.Logger logger = Logger.getLogger ( "Establishment Data Class" );

    public EstablishmentData(String name, String... facilities) {
        this.name = name;
        this.facilities = new HashSet<>(Arrays.asList(facilities));
    }

    public static void mapEstablishmentData() {
        List<EstablishmentData> establishmentData = Arrays.asList(
                new EstablishmentData("Marriott Hotel", "Restaurant/Bar, SPA/Fitness Center, 24H reception, Coffee and tea facilities in all rooms, Wake up call  "),
                new EstablishmentData("Imperial Hotel", "Restaurant/Bar, SPA/Fitness Center, 24H reception, Bycicle hire, Free Wi-Fi in all rooms  "),
                new EstablishmentData("Hilton Hotel", "Restaurant/Bar, SPA/Fitness Center, 24H reception, Allergy free rooms, Sightseeing  "),
                new EstablishmentData("Ana Hotel", "Restaurant/Bar, SPA/Fitness Center, 24H reception, Rooms with connecting doors, Car hire  "),
                new EstablishmentData("Phoenicia Hotel", "Restaurant/Bar, SPA/Fitness Center, 24H reception, Six conference rooms, Lounge with open fire  ")

        );

        establishmentData.stream()
                .flatMap(data -> {
                    logger.log(Level.INFO,"Check our listed hotels facilities: " + data.getName());
                    return data.getFacilities().stream();
                }).forEach(facility -> logger.log(Level.INFO," " + facility));

    }
}
