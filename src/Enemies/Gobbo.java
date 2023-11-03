package Enemies;

import Characters.Player;

public class Gobbo extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Gobbo() {
        super("Gobbo", 5, 1);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("A Gobbo stands in your way !\n" + this);
        super.interaction(player);
    }

    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return this.getEnemyName() + "\n Health : " + this.getLifeLevel() + "\n Strength : " + this.getEnemyStrength();
    }

}
