import CardCenter.Card;
import CardCenter.MatrixCard;
import DB.SQLiteDB;
import Main.Main;

import java.time.Month;
import java.time.YearMonth;

public class test {
    static Main test = new Main();
    static SQLiteDB testTB = new SQLiteDB();
    static String alias = "Tarjeta de Eismer";
    static Card.Brand brand = Card.Brand.VISA;
    static String cardHolderName = "0Eismer Alejandro Lobaina Naranjo";
    static String cardNumber = "1234567890987654";
    static CardCenter.Card.Currency currency = Card.Currency.EUR;
    static String cashierPin = "8888";
    static String telePin = "12341";
    static YearMonth expirationDate = YearMonth.of(2025, Month.APRIL);
    static MatrixCard matrix = null;

    public static void main(String[] args) {
       /*
        System.out.println(test.validatePrivateCard(Card.CardType.PRIVATE,
                "Tarjeta de Eismer",
                Card.Brand.VISA,
                "0Eismer Alejandro Lobaina Naranjo",
                "1234567890987654",
                Card.Currency.EUR,
                "8888",
                "12341",
                YearMonth.of(2025, Month.APRIL),
                null ));
*/
        //testing db of private cards
        System.out.println(testTB.connect());
       // testTB.insertIntoDB("privateCard", Card.CardType.PRIVATE, alias,brand,cardHolderName,cardNumber,currency,cashierPin,telePin,expirationDate, matrix);
    }

}
