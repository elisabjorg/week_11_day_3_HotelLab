import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Pauline", "Rudge");
        bedroom = new Bedroom (1, 4, "Family Room");
    }

    @Test
    public void hasRoomnumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void hasRoomType() {
        assertEquals("Family Room", bedroom.getRoomType());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void isRoomFullTrue() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(true, bedroom.checkRoomFull());
    }

    @Test
    public void isRoomFullFalse() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(false, bedroom.checkRoomFull());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.removeGuest();
        assertEquals(1, bedroom.countGuests());
    }









}
