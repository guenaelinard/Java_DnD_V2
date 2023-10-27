package Ennemies;

import Characters.Player;

public class Sorcerer extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public Sorcerer(){
        this.setName("Sorcerer");
        this.setLifeLevel(9);
        this.setStrength(3);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("A Sorcerer stands in your way !");
    }

    //---------------------------------- TO STRING -----------------------------------
    @Override
    public String toString() {
        return "Sorcerer\n Health : " + this.getLifeLevel() + "\n Strength : " + this.getStrength();
    }


}
