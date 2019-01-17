package Interfaces;

import Enemies.Enemy;

public interface IWeapon {

    public void attack(Enemy enemy);

    public Integer getDamageValue();
}
