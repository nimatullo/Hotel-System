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

public class Main {

    public static void main(String[] args) {

        SherzodHotel hotel = new SherzodHotel();

        hotel.init(30, 30, 80);

        Room room = hotel.findOpenRoom(1, 200);

        User person = new User("Sherzod Nimatullo", new Card(990383001, "Sherzod Nimatullo", 793, LocalDate.of(2022, 03, 19)), room.getRoomNumber());
        hotel.closeRoom(person.getRoomNumber(), person, 3);

        User person2 = new User("Doniyor Nimatullo",
                new Card(331923, "Doniyor Nimatullo", 003, LocalDate.of(2020, 01, 6)),
                hotel.findOpenRoom(2, 300).getRoomNumber());
        hotel.closeRoom(person2.getRoomNumber(), person2, 5);
    }
}
