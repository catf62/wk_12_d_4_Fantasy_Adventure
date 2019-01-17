import Interfaces.IWeapon;
import Players.Barbarian;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    IWeapon club1;
    Barbarian barbarian1;

    @Before
    public void before(){
        club1 = new Club(10);
        barbarian1 = new Barbarian(100, club1);
    }

    @Test
    public void canGetWeapon(){
        assertEquals(10, barbarian1.getWeapon().getDamageValue().intValue());
    }
}
