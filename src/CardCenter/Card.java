package CardCenter;

public class Card {
    protected CardType cardType;//the type will be a PartnerCard or Private Card or
    protected String alias;//alias  of the card
    protected Brand brand;//it defines the card's brand, I mean Visa, MasterCard, Bandec, Metropolitano, BPA etc
    protected String cardNumber;//it defines the card's number
    protected String cardHolderName;//it defines the card's holder name
    protected Currency currency;//it defines the currency of the card



    public Card(CardType cardType,String alias, Brand brand, String cardHolderName, String cardNumber, Currency currency) {
        this.cardType = cardType;
        this.alias = alias;
        this.brand = brand;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.currency = currency;
    }
    public enum CardType {
        PARTNER, PRIVATE, MATRIX
    }
    public enum Brand {
        METROPOLITANO, BANDEC, BPA, VISA, MASTERDCARD, OTHER
    }
    public enum Currency {
        CUP, MLC, USD, EUR, OTHER
    }


    public Card.CardType getCardType() {
        return cardType;
    }

    public String getAlias() {
        return alias;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setAlias(String name) {
        this.alias = alias;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setCardType(Card.CardType cardType) {
        this.cardType = cardType;
    }
}
