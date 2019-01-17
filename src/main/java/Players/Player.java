package Players;

public abstract class Player {

    private Integer healthPoints;

    public Player( Integer healthPoints){
        this.healthPoints = healthPoints;
    }

    public Integer gethealthPoints(){
        return this.healthPoints;
    }

}
