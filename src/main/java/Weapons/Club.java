package Weapons;

import Enemies.Enemy;
import Interfaces.IWeapon;

public class Club implements IWeapon {

    private Integer damageValue;

    public Club(Integer damageValue){
        this.damageValue = damageValue;
    }

    public void attack(Enemy enemy) {
       Integer attackPower = this.damageValue;
        enemy.takeDamage(attackPower);
    }

}
