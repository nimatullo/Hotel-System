package tk.mmvvpp123.HotelClasses;

import tk.mmvvpp123.User;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Room implements Serializable {

    private final int roomNumber;
    private final int bedCount;
    private double perNightCost;
    private boolean open;
    private User user;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int daysOfStay;

    public Room(int roomNumber, int bedCount, double perNightCost) {
        this.roomNumber = roomNumber;
        this.bedCount = bedCount;
        this.perNightCost = perNightCost;
        this.open = true;
    }

    public void closeRoom(User user, int daysOfStay) {
        this.open = false;
        this.user = user;
        this.daysOfStay = daysOfStay;
        this.checkIn = LocalDate.now();
        this.checkOut = checkIn.plusDays(daysOfStay);
        System.out.println("Room #" + roomNumber + " is booked by " + user.getName() + ". Check in date is: " + checkIn + " and check out date is: " + checkOut);
        System.out.println("Total days of stay: " + daysOfStay + "\nTotal will be: $" + perNightCost * daysOfStay);
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
}
