package Players;

public abstract class Player {

    private Integer healthPoints;

    public Player( Integer healthPoints){
        this.healthPoints = healthPoints;
    }

    public Integer getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(Integer newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

}
