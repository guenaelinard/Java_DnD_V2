package Ennemies;

import Game.iSquare;

public class Enemy implements iSquare {


    private String name;
    private int lifeLevel;
    private int strength;

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Enemy(){
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction() {

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
