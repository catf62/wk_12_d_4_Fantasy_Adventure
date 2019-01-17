package Players;

import Interfaces.IHeal;

public class Cleric extends Player implements IHeal {

    IHeal healer;

    public Cleric (Integer healthPoints, IHeal healer) {
        super(healthPoints);
        this.healer = healer;
    }

    public void heal(Player player){

    }
}
