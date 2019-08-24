package tk.mmvvpp123;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Card implements Serializable {

    private int cardNumber;
    private String name;
    private int CVV;
    private LocalDate dateofExpiration;

    public Card(int cardNumber, String name, int CVV, LocalDate dateofExpiration) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.CVV = CVV;
        this.dateofExpiration = dateofExpiration;
    }
}
