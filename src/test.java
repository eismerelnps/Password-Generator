import CardCenter.Card;
import Main.Main;

import java.time.Month;
import java.time.YearMonth;

public class test {
    static Main test = new Main();

    public static void main(String[] args) {
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
    }
}
