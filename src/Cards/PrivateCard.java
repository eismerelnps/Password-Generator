package Cards;

public class PrivateCard extends Card{
    private String secretPin;
    private String expirationMonth;
    private String expirationYear;
    private MatrixCard matrix;

    public PrivateCard(String alias, String brand, String cardHolderName, String cardNumber, String currenncy, String secretPin, String expirationMonth, String expirationYear, MatrixCard matrix) {
        super(alias, brand, cardHolderName, cardNumber, currenncy);
        this.secretPin = secretPin;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.matrix = matrix;
    }

    public String getSecretPin() {
        return secretPin;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public MatrixCard getMatrix() {
        return matrix;
    }

    public void setSecretPin(String secretPin) {
        this.secretPin = secretPin;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setMatrix(MatrixCard matrix) {
        this.matrix = matrix;
    }
}
