package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteDB {
    String message = null;
    private String url = "jdbc:sqlite:kugard";
    private Connection connection;

    public String connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:test.sqlite");
            message = "Conectado con éxito a la BD";
        } catch (SQLException exception) {
            message = "Se ha producido un error: "+exception;
        }
        return message;
    }
}
