# Hotel-System

Hotel Management system allows for organizing rooms, users, and payment information. You want to initialize the hotel using

```java
void init(int oneSleep, int twoSleep, int threeSleep)
```
Parameters for this method are the number of rooms of each type. One sleep is one bed, two sleep are two beds and so on. Make sure these values add up to 140 or whatever you set the Room [] rooms array max length to.

# Table of Contents
1. [User Class](#class-user)
2. [Room Class](#class-room)
3. [SherzodHotel Class](#class-sherzodhotel)
3. [TODO](#todo)

## Program Breakdown
### Class: User
The User class is responsible for creating a User which will be used when booking a Room. A Room requires a User parameter in order for the Room to be booked. 

**Methods**
- **```getName()```** : returns the name of the user
- **getRoomNumber** : returns the room number that the user is checked into
___
### Class: Room
The Room class represents a Room in the hotel.

**Methods**
- ```closeRoom()``` : closes the room by putting the room number under the User that is provided. Takes the daysOfStay and determines the checkIn and checkOut dates
- **openRoom** : make the room available for stay
- **getGuestName** : returns the name of the User in the room
- **isOpen** : returns true if there is no User that has checked in
- **getRoomNumber** : returns the room number
- **getBedCount** : returns the number of beds
- **getPerNightCost** : returns the price per night of the room
- **getCheckOut** : returns the date of checkout
___
### Class: SherzodHotel
This class is the class that makes everything run. It represents the Hotel.

**Methods**
- **init** : fills the list of rooms (```Room [] rooms```) with the appropriate rooms with the supplied bed counts.
- **closeRoom** : although this method shares the same name as the method in the Room class, this one is used as a search method in order to close a specified room, therefore, an instance of the room that you'd like to be closed does not need to be created in the main class.
- **emptyRooms** : returns the number of rooms that are available for stay
- **findOpenRoom** : returns a room that matches the parameters that are passed into the method
- **whoIsIn** : returns the name of the guest that is staying at the specified room number
- **findRoomNumberOf** : returns the room number of the specified guest
- **checkForStays** : looks through the entire list of rooms in the hotel to check if anyone is passed their checkout date. If so, that room is made available.
- **save** : saves the list of rooms to a binary file called "rooms.bin"
- **load** : loads the list of rooms, after it's loaded, it checks for overstaying.
- **getRooms** : returns a list of rooms
___
### TODO
1. Save data to database.
