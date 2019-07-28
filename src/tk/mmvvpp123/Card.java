package tk.mmvvpp123;

import java.util.Date;

public class Card {

    private int cardNumber;
    private String name;
    private int CVV;
    private Date dateofExpiration;

    public Card(int cardNumber, String name, int CVV, Date dateofExpiration) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.CVV = CVV;
        this.dateofExpiration = dateofExpiration;
    }
}
