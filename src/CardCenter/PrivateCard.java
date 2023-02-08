package CardCenter;

import java.time.YearMonth;

public class PrivateCard extends Card {
    private String cashierPin;//pin for operanting card on cashier
    private String telePin;//pin for operating card on transfermovil
    private YearMonth expirationDate;
    private MatrixCard matrix;

    public PrivateCard(String alias, String brand, String cardHolderName, String cardNumber, String currenncy, String cashierPin, String telePin, YearMonth expirationDate, MatrixCard matrix) {
        super(alias, brand, cardHolderName, cardNumber, currenncy);
        this.cashierPin = cashierPin;
        this.telePin = telePin;
        this.expirationDate = expirationDate;
        this.matrix = matrix;
    }

    public String getCashierPin() {
        return cashierPin;
    }

    public String getTelePin() {
        return telePin;
    }

    public YearMonth getExpirationDate() {
        return expirationDate;
    }

    public MatrixCard getMatrix() {
        return matrix;
    }

    public void setCashierPin(String cashierPin) {
        this.cashierPin = cashierPin;
    }

    public void setTelePin(String telePin) {
        this.telePin = telePin;
    }

    public void setExpirationDate(YearMonth expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setMatrix(MatrixCard matrix) {
        this.matrix = matrix;
    }
}
