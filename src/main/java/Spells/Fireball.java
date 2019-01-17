package Spells;

import Enemies.Enemy;
import Interfaces.ISpell;

public class Fireball implements ISpell {

    private Integer damageValue;

    public Fireball(Integer damageValue){
        this.damageValue = damageValue;
    }

    public void cast(Enemy enemy) {
        Integer spellPower = this.damageValue;
        enemy.takeDamage(spellPower);
    }
}
