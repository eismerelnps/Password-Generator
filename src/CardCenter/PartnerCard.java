package CardCenter;

public class PartnerCard extends Card {
    private String confirmNumber;

    public PartnerCard(CardType cardType,String alias, String brand, String cardHolderName, String cardNumber, String currency, String confirmNumber) {
        super(cardType ,alias, brand, cardHolderName, cardNumber, currency);
        this.confirmNumber = confirmNumber;
    }

    public String getConfirmNumber() {
        return confirmNumber;
    }

    public void setConfirmNumber(String confirmNumber) {
        this.confirmNumber = confirmNumber;
    }
}
