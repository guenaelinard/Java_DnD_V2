package Ennemies;

import Characters.Player;

public class Sorcerer extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public Sorcerer(){
        this.setEnemyName("Sorcerer");
        this.setEnemyLifeLevel(9);
        this.setEnemyStrength(2);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("A Sorcerer stands in your way !\n" + this);
        super.interaction(player);

    }

    //---------------------------------- TO STRING -----------------------------------
    @Override
    public String toString() {
        return "Sorcerer\n Health : " + this.getEnemyLifeLevel() + "\n Strength : " + this.getEnemyStrength();
    }


}
