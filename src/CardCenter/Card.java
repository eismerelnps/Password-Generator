package CardCenter;

public class Card {
    protected CardType cardType;//the type will be a PartnerCard or Private Card or
    protected String alias;//alias  of the card
    protected String brand;//it defines the card's brand, I mean Visa, MasterCard, Bandec, Metropolitano, BPA etc
    protected String cardNumber;//it defines the card's number
    protected String cardHolderName;//it defines the card's holder name
    protected String currency;//it defines the currency of the card



    public Card(CardType cardType,String alias, String brand, String cardHolderName, String cardNumber, String currency) {
        this.cardType = cardType;
        this.alias = alias;
        this.brand = brand;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.currency = currency;
    }
    public enum CardType {
        Partner, Private, Matrix
    }


    public Card.CardType getCardType() {
        return cardType;
    }

    public String getAlias() {
        return alias;
    }

    public String getBrand() {
        return brand;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCurrency() {
        return currency;
    }


    public void setAlias(String name) {
        this.alias = alias;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCardType(Card.CardType cardType) {
        this.cardType = cardType;
    }
}
