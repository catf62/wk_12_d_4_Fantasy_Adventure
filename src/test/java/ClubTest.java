import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club1;

    @Before
    public void before(){
        club1 = new Club(10);
    }

    @Test
    public void canGetDamageValue(){
        assertEquals(10, club1.getDamageValue().intValue());
    }
}
