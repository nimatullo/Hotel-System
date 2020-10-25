package tk.mmvvpp123.HotelClasses;

import tk.mmvvpp123.User;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDate;

public class SherzodHotel {
    private Room [] rooms;

    // Some changes
    public SherzodHotel(){
        if (new File("rooms.bin").exists()) {
            this.rooms = load();
        }
        else
            this.rooms = new Room[140];
        // I'm going to add some comments to see how merges work
    }

    public void init(int oneSleep, int twoSleep, int threeSleep) {
        int roomNumberCounter = 0;
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
            roomNumberCounter++;
            rooms[i] = createdRoom;
        }
    }

    public void closeRoom(int roomNumber, User user, int daysOfStay) {
        rooms[roomNumber].closeRoom(user, daysOfStay);
        save();
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
            if (rooms[i].getBedCount() == bedCount && rooms[i].getPerNightCost() <= perNightCost && rooms[i].isOpen()) {
                System.out.println("Open room at room #: " + rooms[i].getRoomNumber());
                return rooms[i];
            }
        }
        return null;
    }

    public String whoIsIn(int roomNumber) {
        return rooms[roomNumber].getGuestName();
    }

    public Room findRoomNumberOf(String name) {
        for (Room roomElement : rooms) {
            if (roomElement.getGuestName().equals(name)) {
                return roomElement;
            }
        }
        System.out.println("Can't find the room.");
        return null;
    }

    public void checkForStays() {
        LocalDate currentDay = LocalDate.now();
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isOpen()) {
                if (rooms[i].getCheckOut().isBefore(currentDay)) {
                    rooms[i].openRoom();
                }
            }
        }
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
            checkForStays();
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
