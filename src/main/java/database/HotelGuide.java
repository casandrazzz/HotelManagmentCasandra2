package database;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class HotelGuide {

    private int id;
    private String name;
    private boolean allowsPets;
    private Timestamp createDate;


}
