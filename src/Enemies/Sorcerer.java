package Enemies;

import Characters.Player;

public class Sorcerer extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public Sorcerer() {
        super("Sorcerer", 9, 4);
    }

    //-------------------------------- METHODS --------------------------------

    /**
     * Method used when a player is on the Sorcerer index in the ArrayList.
     *
     * @param player the current player who initiated the interaction.
     */
    @Override
    public void interaction(Player player) {
        System.out.println("A Sorcerer stands in your way !\n" + this);
        super.interaction(player);

    }
    //---------------------------------- TO STRING -----------------------------------

    /**
     * Method used when needed to show the info of the Sorcerer.
     *
     * @return the attributes of the Sorcerer.
     */
    @Override
    public String toString() {
        return "Sorcerer\n Health : " + this.getLifeLevel() + "\n Strength : " + this.getEnemyStrength();
    }


}
