package tk.mmvvpp123.HotelClasses;

import tk.mmvvpp123.User;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDate;

public class SherzodHotel {
    private Room [] rooms;

    public SherzodHotel(){
        if (new File("rooms.bin").exists()) {
            this.rooms = load();
        }
        else
            this.rooms = new Room[140];
    }

    public void init(int oneSleep, int twoSleep, int threeSleep) {
        int roomNumberCounter = 001;
        for (int i = 0; i < rooms.length; i++) {
            Room createdRoom;
            if (oneSleep != 0) {
                createdRoom = new Room(roomNumberCounter, 1, 89);
                oneSleep--;
            } else if (twoSleep != 0) {
                createdRoom = new Room(roomNumberCounter, 2, 100);
                twoSleep--;
            } else {
                createdRoom = new Room(roomNumberCounter, 3, 120);
                threeSleep--;
            }
            rooms[i] = createdRoom;
            roomNumberCounter++;
        }
    }

    public void closeRoom(int roomNumber, User user, int daysOfStay) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getRoomNumber() == roomNumber) {
                rooms[i].closeRoom(user, daysOfStay);
                save();
            }
        }
    }

    public int emptyRooms() {
        int emptyRoomCount = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null || rooms[i].isOpen()) {
                emptyRoomCount++;
            }
        }
        return emptyRoomCount;
    }

    public Room findOpenRoom(int bedCount, double perNightCost) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getBedCount() == bedCount && rooms[i].getPerNightCost() <= perNightCost) {
                System.out.println("Open room at room #: " + rooms[i].getRoomNumber());
                return rooms[i];
            }
        }
        return null;
    }

    public void save() {
        try {
            File userFile = new File("rooms.bin");
            FileOutputStream file = new FileOutputStream(userFile);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(rooms);

            out.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Room [] load() {
        try {
            FileInputStream file = new FileInputStream(new File("rooms.bin"));
            ObjectInputStream in = new ObjectInputStream(file);

            rooms = (Room[]) in.readObject();

            in.close();
            file.close();

            System.out.println("Loaded");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class is not found");
        }
        return rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
