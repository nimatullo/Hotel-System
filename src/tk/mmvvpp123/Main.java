package tk.mmvvpp123;

import tk.mmvvpp123.HotelClasses.Room;
import tk.mmvvpp123.HotelClasses.SherzodHotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SherzodHotel hotel = new SherzodHotel();
        hotel.init(30, 30, 80);
        Room rm = hotel.findOpenRoom(2, 200);
        User user = new User("sn", new Card(12312, "sn", 987, LocalDate.now()), rm.getRoomNumber());
        hotel.closeRoom(rm.getRoomNumber(), user, 2);


    }
}
