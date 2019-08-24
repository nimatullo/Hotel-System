# Hotel-System

Hotel Management system allows for organizing rooms, users, and payment information. You want to initialize the hotel using

```java
void init(int oneSleep, int twoSleep, int threeSleep)
```
Parameters for this method are the number of rooms of each type. One sleep is one bed, two sleep are two beds and so on. Make sure these values add up to 140 or whatever you set the Room [] rooms array max length to.

## Program Breakdown
### Class: User
The User class is responsible for creating a User which will be used when booking a Room. A Room requires a User parameter in order for the Room to be booked. 

**Methods**
- **getName** : returns the name of the user
- **getRoomNumber** : returns the room number that the user is checked into
___
### Class: Room
The Room class is an instance of a single Room in the hotel.

**Methods**
- **closeRoom** : closes the room by putting the room number under the User that is provided. Takes the daysOfStay and determines the checkIn and checkOut dates
- **getGuestName** : returns the name of the User in the room
- **isOpen** : returns true if there is no User that has checked in
- **getRoomNumber** : returns the room number
- **getBedCount** : returns the number of beds
- **getPerNightCost** : returns the price per night of the room
