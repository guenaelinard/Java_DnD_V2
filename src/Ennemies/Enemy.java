package Ennemies;

public class Enemy {


    private String name;
    private int lifeLevel;
    private int strength;

    public Enemy(String name){
        this.name = name;
    }


    //-------------------------------- GET/SET --------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int liveLevel) {
        this.lifeLevel = liveLevel;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
