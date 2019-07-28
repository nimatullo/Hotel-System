package tk.mmvvpp123.HotelClasses;

import tk.mmvvpp123.User;

import java.io.Serializable;

public class Room implements Serializable {

    private final int roomNumber;
    private final int bedCount;
    private double perNightCost;
    private boolean open;
    private User user;

    public Room(int roomNumber, int bedCount, double perNightCost) {
        this.roomNumber = roomNumber;
        this.bedCount = bedCount;
        this.perNightCost = perNightCost;
        this.open = true;
    }

    public void setGuestName(User user) {
        this.user = user;
    }

    public String getGuestName() {
        return user.getName();
    }

    public boolean isOpen() {
        return open;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getBedCount() {
        return bedCount;
    }

    public double getPerNightCost() {
        return perNightCost;
    }

    public void openRoom(boolean closeOrOpen) {
        this.open = closeOrOpen;
    }
}
