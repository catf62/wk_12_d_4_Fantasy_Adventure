package Players;

import Enemies.Enemy;
import Interfaces.IDefend;
import Interfaces.ISpell;

public abstract class Mage extends Player implements IDefend, ISpell {

    private IDefend mythicalCreature;
    private ISpell spell;

    public Mage(Integer healthPoints, IDefend mythicalCreature, ISpell spell){
        super(healthPoints);
        this.mythicalCreature = mythicalCreature;
        this.spell = spell;
    }

    public IDefend getMythicalCreature(){
        return this.mythicalCreature;
    }

    public void setMythicalCreature(IDefend newMythicalCreature){
        this.mythicalCreature = newMythicalCreature;
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }
}
