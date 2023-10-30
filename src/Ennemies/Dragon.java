package Ennemies;

import Characters.Player;

public class Dragon extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public Dragon() {
        this.setEnemyName("Dragon");
        this.setEnemyLifeLevel(15);
        this.setEnemyStrength(4);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("A Dragon stands in your way !\n" + this);
        super.interaction(player);
    }

    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return "Dragon\n Health : " + this.getEnemyLifeLevel() + "\n Strength : " + this.getEnemyStrength();
    }
}
