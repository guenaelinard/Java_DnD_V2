package Enemies;

import Characters.Player;

public class Gobbo extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Gobbo() {
        super("Gobbo", 5, 1);
    }

    //-------------------------------- METHODS --------------------------------

    /**
     * Method used when a player is on the Gobbo index in the ArrayList.
     *
     * @param player the current player who initiated the interaction.
     */
    @Override
    public void interaction(Player player) {
        System.out.println("A Gobbo stands in your way !\n" + this);
        super.interaction(player);
    }

    //---------------------------------- TO STRING -----------------------------------

    /**
     *  Method used when needed to show the info of the Gobbo.
     * @return the attributes of the Gobbo.
     */
    @Override
    public String toString() {
        return this.getEnemyName() + "\n Health : " + this.getLifeLevel() + "\n Strength : " + this.getEnemyStrength();
    }

}
