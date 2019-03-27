import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (checkRoomFull() == false){
            this.guests.add(guest);
        }

    }

    public boolean checkRoomFull() {
        if (countGuests() > getCapacity()) {
            return true;
        }
        return false;
    }

    public Guest removeGuest() {
        return this.guests.remove(0);
    }


}

