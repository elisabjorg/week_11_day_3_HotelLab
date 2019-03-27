import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Booking booking;

    @Before
    public void before() {
        bedroom = new Bedroom(2, 2, "Double");
        conferenceRoom = new ConferenceRoom("Lincoln", 20);
        guest = new Guest("Bill", "Clinton");
        hotel = new Hotel();
        booking = new Booking(bedroom, 3);

    }

    @Test
    public void canCheckInBedroom() {
        hotel.checkInBedroom(guest, bedroom);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canCheckOutBedroom() {
        hotel.checkInBedroom(guest, bedroom);
        hotel.checkInBedroom(guest, bedroom);
        hotel.checkOutBedroom(bedroom);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canCheckInConferenceRoom() {
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.countGuests());
    }

    @Test
    public void canCheckOutConferenceRoom() {
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        hotel.checkOutConferenceRoom(conferenceRoom);
        assertEquals(2, conferenceRoom.countGuests());

    }

    @Test
    public void canBookBedroom() {
        Booking newBooking = hotel.bookBedroom(3, bedroom);
        assertEquals(booking, newBooking);
    }


}






