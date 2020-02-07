package ba.edu.ssst;

public class Hotel implements Ratable {
    private int numberOfRooms;
    private int availableRooms;
    private final int listOfGuests;

    public Hotel(int numberOfRooms, int availableRooms, int listOfGuests) {
        this.numberOfRooms = numberOfRooms;
        this.availableRooms = availableRooms;
        this.listOfGuests = listOfGuests;
    }

    @Override
    public void setRange(int num1, int num2) {
        this.numberOfRooms = num2;
        this.availableRooms = num1;
    }

    @Override
    public void setRating(int rating) {
        this.getRating();
    }

    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public String toString() {
        return this.numberOfRooms + ", " + this.availableRooms + ", " + this.listOfGuests;
    }
}
