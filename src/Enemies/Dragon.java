package Enemies;

import Characters.Player;

public class Dragon extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public Dragon() {
    super("Dragon", 15, 4);
    }

    //-------------------------------- METHODS --------------------------------

    /**
     * Method used when a player is on the Dragon index in the ArrayList.
     * @param player the current player who initiated the interaction.
     *               inherited from the interface {@link Enemy}
     */
    @Override
    public void interaction(Player player) {
        System.out.println("A Dragon stands in your way !\n" + this);
        super.interaction(player);
    }

    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return "Dragon\n Health : " + this.getLifeLevel() + "\n Strength : " + this.getEnemyStrength();
    }

}
