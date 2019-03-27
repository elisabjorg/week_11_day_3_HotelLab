import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Booking booking;


    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.booking = new Booking(null, 0);
    }

    public void checkInBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public Guest checkOutBedroom(Bedroom bedroom) {
        return bedroom.removeGuest();
    }

    public void checkInConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public Guest checkOutConferenceRoom(ConferenceRoom conferenceRoom) {
        return conferenceRoom.removeGuest();
    }

    public Booking bookBedroom(int numNights, Bedroom bedroom ) {
        booking.setNumberNights(numNights);
        booking.setBedroom(bedroom);
        return booking;
    }




}
