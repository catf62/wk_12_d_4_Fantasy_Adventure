package Players;

import Enemies.Enemy;
import Interfaces.IWeapon;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IWeapon {
    private IWeapon weapon;

    public Fighter(Integer healthPoints, IWeapon weapon){
        super(healthPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }

    public void attack(Enemy enemy){
        Integer attackForce = this.weapon.damageValue;
        enemy.takeDamage(attackForce);
    }
}
