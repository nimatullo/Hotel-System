package tk.mmvvpp123;

import tk.mmvvpp123.HotelClasses.Room;
import tk.mmvvpp123.HotelClasses.SherzodHotel;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        SherzodHotel hotel = new SherzodHotel();
        hotel.init(40, 50, 50);

        Room room = hotel.findOpenRoom(1, 200);

        User person = new User("Sherzod Nimatullo", new Card(990383001, "Sherzod Nimatullo", 793, new Date(2019, 3, 10)), room.getRoomNumber());
        hotel.closeRoom(person.getRoomNumber(), person);

        User person2 = new User("Doniyor Nimatullo",
                                new Card(331923, "Doniyor Nimatullo", 003, new Date(2020, 3, 1)),
                                hotel.findOpenRoom(2, 300).getRoomNumber());
        hotel.closeRoom(person2.getRoomNumber(), person2);
    }

}
