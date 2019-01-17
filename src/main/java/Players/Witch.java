package Players;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Witch extends Mage {

    public Witch(Integer healthPoints, IDefend mythicalCreature, ISpell spell){
        super(healthPoints, mythicalCreature, spell);
    }

}
