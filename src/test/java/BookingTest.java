import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookingTest {

    Bedroom bedroom;
    Booking booking;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 4, "Family Room");
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void hasNumberNights() {
        assertEquals(5, booking.getNumberNights());
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void canSetNumberNights() {
        booking.setNumberNights(6);
        assertEquals(6, booking.getNumberNights());
    }
}
