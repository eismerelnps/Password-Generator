package DB;

import CardCenter.Card;
import CardCenter.MatrixCard;

import java.sql.*;
import java.time.YearMonth;

public class SQLiteDB {
    static String message = null;
    private static String url = "jdbc:sqlite:kugard";
    private static Connection connection;

    public static String connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:test.kugard");
            message = "Conectado con éxito a la BD";
        } catch (SQLException exception) {
            message = "Se ha producido un error: "+exception;
        }
        return message;
    }
    public static String createDB(){
        return message;
    }
    public static String createTable(){
    connect();
    String cardType = "BPS";
    String createTable = " CREATE TABLE privateCard ( "+ cardType+ "integer );";
        return message;
    }
    public static ResultSet test(){
        connect();
        Statement statement;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("SELECT * FROM privateCard");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultSet;
    }

    public static void insertIntoDB(String table, Card.CardType cardType, String alias, Card.Brand brand, String cardHolderName, String cardNumber, Card.Currency currency, String cashierPin, String telePin, YearMonth expirationDate, MatrixCard matrix) {
        connect();
        String insertIntoSql = " INSERT INTO " + table + " VALUES (?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertIntoSql)) {
            preparedStatement.setString(1, String.valueOf(cardType));
            preparedStatement.setString(2, alias);
            preparedStatement.setString(3, String.valueOf(brand));
            preparedStatement.setString(4, cardHolderName);
            preparedStatement.setString(5, cardNumber);
            preparedStatement.setString(6, String.valueOf(currency));
            preparedStatement.setString(7, cashierPin);
            preparedStatement.setString(8, telePin);
            preparedStatement.setString(9, String.valueOf(expirationDate));
            preparedStatement.setString(10, String.valueOf(matrix));
            int insert = preparedStatement.executeUpdate();
            System.out.println("Number of rows updated: " + insert);
        } catch (SQLException e) {
            System.err.println("Error while executing update: " + e.getMessage());
        }
    }
}
