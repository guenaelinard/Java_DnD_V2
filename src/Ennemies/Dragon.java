package Ennemies;

import Characters.Player;

public class Dragon extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public Dragon() {
        this.setName("Dragon");
        this.setLifeLevel(15);
        this.setStrength(4);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("A Dragon stands in your way !");
    }

    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return "Dragon\n Health : " + this.getLifeLevel() + "\n Strength : " + this.getStrength();
    }
}
