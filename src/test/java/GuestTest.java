import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Elisa", "Sveinsdottir");
    }

    @Test
    public void hasFirstName() {
        assertEquals("Elisa", guest.getFirstName());
    }

    @Test
    public void hasLastName() {
        assertEquals("Sveinsdottir", guest.getLastName());
    }

}
