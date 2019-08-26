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

        hotel.findOpenRoom(1, 300);

    }
}
