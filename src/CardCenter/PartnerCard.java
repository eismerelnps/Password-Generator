package CardCenter;

public class PartnerCard extends Card {
    private String confirmNumber;

    public PartnerCard(String alias, String brand, String cardHolderName, String cardNumber, String currency, String confirmNumber) {
        super(alias, brand, cardHolderName, cardNumber, currency);
        this.confirmNumber = confirmNumber;
    }

    public String getConfirmNumber() {
        return confirmNumber;
    }

    public void setConfirmNumber(String confirmNumber) {
        this.confirmNumber = confirmNumber;
    }
}
