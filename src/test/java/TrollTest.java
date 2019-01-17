import Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll1;

    @Before
    public void before(){
        troll1 = new Troll(150);
    }

    @Test
    public void canGetHealthpoints(){
        assertEquals(150, troll1.getHealthPoints().intValue());
    }

    @Test
    public void canSetHealthPoints(){
        troll1.setHealthPoints(200);
        assertEquals(200, troll1.getHealthPoints().intValue());
    }
}
