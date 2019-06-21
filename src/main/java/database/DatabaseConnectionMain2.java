package database;

import model.commercial.Hotel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionMain2 {


    public static void main(String... args) {

        // load driver
        // driver manager
        // connection
        // non-transactional flow - > autoCommit is set true -> no rollback

        Connection connection2 = DatabaseConnectionMain.newConnection(
        );

        try {
            assert connection2 != null;
            connection2.setAutoCommit(true);
            System.out.println("Non - transactional flows begins: AutoCommit is set true");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            // UPDATE TABLE;


            PreparedStatement preparedStatement =
                    connection2.prepareStatement("update hotelGuides SET name = 'Hotel Peru' where allowsPets = false");

            preparedStatement.execute();
            System.out.println("Table hotelsGuide is updated");

            PreparedStatement preparedStatement5 =
                    connection2.prepareStatement("DELETE FROM hotelGuides where name = 'Hotel Island' ");

            preparedStatement5.execute();


            Statement statement =
                    connection2.createStatement();
            ResultSet resultSet = statement.executeQuery("select name, allowsPets from hotelGuides");

            List<Hotel> hotelGuides = new ArrayList<>();

            while (resultSet.next()) {
                Hotel hotel = new Hotel();
                hotel.setName(resultSet.getString("Name"));
                hotel.setAllowsPets(resultSet.getBoolean("allowsPets"));
                hotelGuides.add(hotel);
            }

            hotelGuides.forEach(System.out::println);
            System.out.println("Values are mapped to existing object");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



