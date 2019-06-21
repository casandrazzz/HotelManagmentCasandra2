package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Rollback {

    private static String INSERT = "INSERT INTO hotelsGuide (id, name) VALUES (?,?)";

    public static void insertRow(Connection connection, int idRow, String contentRow) throws SQLException{
        PreparedStatement pstmt = null;
        pstmt = connection.prepareStatement(INSERT);
        pstmt.setInt(1, idRow);
        pstmt.setString(2, contentRow);
        pstmt.execute();
        pstmt.close();
    }
}
