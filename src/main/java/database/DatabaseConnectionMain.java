package database;

import model.commercial.Hotel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionMain {


    public static void main(String... args) {

        // load driver
        // driver manager
        // connection
        // transactional flow -> autoCommit is set to false


        Connection connection = newConnection(
        );

        try {
            assert connection != null;
            connection.setAutoCommit(false);
            System.out.println("Transactional flows begins: AutoCommit is set to false");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            // transactional flow -> BEGIN
            // CREATE TABLE hotels;
            // INSERT INTO hotels;
            // ROLLBACK is possible if transaction is not successful;


            PreparedStatement preparedStatement =
                    connection.prepareStatement("create table IF NOT EXISTS hotelGuides (" +
                            "ID SERIAL PRIMARY KEY," +
                            "name varchar(64) NOT NULL," +
                            "allowsPets boolean NOT NULL," +
                            "createDate timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP NOT NULL" + ")");

            preparedStatement.execute();
            System.out.println("Table hotelsGuide is created");

            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into hotelGuides ( name, allowsPets) values ('Hotel America', true ) ");

            preparedStatement1.execute();

            PreparedStatement preparedStatement2 =
                    connection.prepareStatement("insert into hotelGuides ( name, allowsPets) values ('Hotel Venezuela', true ) ");

            preparedStatement2.execute();

            PreparedStatement preparedStatement3 =
                    connection.prepareStatement("insert into hotelGuides ( name, allowsPets) values ('Hotel Island', false ) ");

            preparedStatement3.execute();

            PreparedStatement preparedStatement4 =
                    connection.prepareStatement("insert into hotelGuides (name, allowsPets) values ('Hotel North Pole', false ) ");
            System.out.println("Values are inserted into table");

            preparedStatement4.execute();


            Statement statement =
                    connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select name, allowsPets from hotelGuides");
            System.out.println(resultSet);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            int columnsNumber = resultSetMetaData.getColumnCount();

            List<Hotel> hotelGuides = new ArrayList<>();

            while (resultSet.next()) {
                Hotel hotel = new Hotel();
                hotel.setName(resultSet.getString("Name"));
                hotel.setAllowsPets(resultSet.getBoolean("allowsPets"));
                hotelGuides.add(hotel);
                for (int i = 1; i <= columnsNumber; i++) {
                    System.out.println(resultSet.getString(i) + " ");
                }
            }

            hotelGuides.forEach(System.out::println);
            System.out.println("Values are mapped to existing object");

            PreparedStatement preparedStatement5 =
                    connection.prepareStatement("delete from  hotelGuides where name = 'Hotel Island' ");
            preparedStatement5.execute();


            Statement statement2 =
                    connection.createStatement();
            ResultSet resultSet2 = statement2.executeQuery("select * from hotelGuides");
            ResultSetMetaData resultSetMetaData2 = resultSet2.getMetaData();

            int columnsNumber2 = resultSetMetaData2.getColumnCount();

            while (resultSet2.next()) {
                for (int i = 1; i <= columnsNumber2; i++) {
                    System.out.println(resultSet2.getString(i) + " ");
                }
            }

            PreparedStatement preparedStatement6 =
                    connection.prepareStatement("update hotelsGuide set id = ?, name = ? where id = ?");

            preparedStatement6.setInt(1, 10);
            preparedStatement6.setString(2, "Hotel Tropical");
            preparedStatement6.setInt(3, 4);
            preparedStatement6.execute();


            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    static Connection newConnection() {

        loadDriver();

        String url = "jdbc:" + "postgresql" + "://" + "localhost" + ":" + "5432" + "/" + "homework9" + "?user=" +
                "postgres" + "&password=" + "1234";

        System.out.println(url);

        try {

            return DriverManager.getConnection(url);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static void loadDriver() {

        try {
            Class.forName("org.postgresql.Driver").newInstance();

        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}


