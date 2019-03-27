import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfernceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Marshall", 20);
        guest = new Guest("Nuno", "Smith");
    }

    @Test
    public void hasName() {
        assertEquals("Marshall", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, conferenceRoom.getCapacity());
    }

    @Test
    public void roomStartsEmpty() {
        TestCase.assertEquals(0, conferenceRoom.countGuests());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest);
        TestCase.assertEquals(1, conferenceRoom.countGuests());
    }

    @Test
    public void isRoomFullTrue() {
        for(int i=0; i < 25; i++){
        conferenceRoom.addGuest(guest);}
        TestCase.assertEquals(true, conferenceRoom.checkRoomFull());
    }

    @Test
    public void isRoomFullFalse() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        TestCase.assertEquals(false, conferenceRoom.checkRoomFull());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest();
        TestCase.assertEquals(1, conferenceRoom.countGuests());
    }


}

