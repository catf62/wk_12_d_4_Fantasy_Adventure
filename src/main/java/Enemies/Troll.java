package Enemies;

public class Troll extends Enemy {
    Integer healthPoints;

    public Troll(Integer healthPoints){
       super(healthPoints);
    }

    public void takeDamage(Integer attackPower){
        this.healthPoints -= attackPower;
    }
}
