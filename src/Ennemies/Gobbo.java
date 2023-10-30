package Ennemies;

import Characters.Player;

public class Gobbo extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Gobbo() {
        this.setName("Gobbo");
        this.setLifeLevel(6);
        this.setStrength(1);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("A Gobbo stands in your way !");
    }


    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return  this.getName() +"\n Health : " + this.getLifeLevel() + "\n Strength : " + this.getStrength();
    }
}
