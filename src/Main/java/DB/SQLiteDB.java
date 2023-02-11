package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDB {

    private static Connection connect() {
        // db parameters
        String url = "jdbc:sqlite:sqlite.db";
        // Connect to database
        Connection conn = null;
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS tarjetas (\n"
                + " id integer PRIMARY KEY,\n"
                + " alias text NOT NULL,\n"
                + " tipo text NOT NULL,\n"
                + " numero text NOT NULL,\n"
                + " nombre text NOT NULL,\n"
                + " moneda text NOT NULL\n"
                + ");";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void CreateDB() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=rootpassword");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("CREATE DATABASE db_name");
                System.out.println("Database created successfully...");
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        public void addprivateCard(){}


}
