package ba.edu.ssst;

import java.util.ArrayList;

public class Hotel implements Ratable {
    private final int numberOfRooms;
    private final int numberOfAvaliableRooms;
    private final ArrayList<String> guests;

    public Hotel(int numberOfRooms, int numberOfAvaliableRooms, ArrayList<String> guests) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfAvaliableRooms = numberOfAvaliableRooms;
        this.guests = guests;
    }

    public void checkIn(String guest) {
        guests.add(guest);
    }

    public void checkOut(String g) {
        guests.remove(g);
    }

    @Override
    public String toString() {
        return this.numberOfRooms + " " + this.numberOfAvaliableRooms + " " + this.guests;
    }

    @Override
    public void setRange(int min, int max) {

    }
}
