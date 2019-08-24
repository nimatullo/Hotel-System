package tk.mmvvpp123;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private Card creditCardInfo;
    private int roomNumber;

    public User(String name, Card creditCardInfo, int roomNumber) {
        this.name = name;
        this.creditCardInfo = creditCardInfo;
        this.roomNumber = roomNumber;
        System.out.println("User " + name + " created.");
    }

    public String getName() {
        return name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
