package whole.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private static String URL="jdbc:postgresql://localhost/workouts";
    private static String NAME= "postgres";
    private static String PASSWORD= "12345";

    public static Connection connect () {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL,NAME,PASSWORD);
            System.out.println("Poloczano");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
