package Enemies;

public abstract class Enemy {

    private Integer healthPoints;

    public Enemy(Integer healthPoints){
        this.healthPoints = healthPoints;
    }

    public Integer getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(Integer newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

    public void takeDamage(Integer attackPower){
        this.healthPoints -= attackPower;
    }
}
