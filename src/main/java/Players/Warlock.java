package Players;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Warlock extends Mage {


    public Warlock(Integer healthPoints, IDefend mythicalCreature, ISpell spell){
        super(healthPoints, mythicalCreature, spell);
    }


}
