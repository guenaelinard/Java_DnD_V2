package Items.healing;

import Characters.Player;
import Game.ISquare;

public abstract class HealingItems implements ISquare {

    protected String name;

    protected int healValue;


    //-------------------------------- METHODS --------------------------------

    /**
     * Method to interact with the player and determine the output of it.
     *
     * @param player the current player who initiated the interaction.
     */
    @Override
    public void interaction(Player player) {
        System.out.println("You found a " + this.name + ".");
        if (player.getLifeLevel() == player.getCharMaxLife()) {
            System.out.println("Your HP are already maxed out.");
        } else if (player.getLifeLevel() < player.getCharMaxLife()) {
            player.setCharLifeLevel(player.getLifeLevel() + this.healValue);
            if (player.getLifeLevel() > player.getCharMaxLife()) {
                player.setCharLifeLevel(player.getCharMaxLife());
                System.out.println("You're full life !");
            } else {
                System.out.println("You've regained " + this.healValue + "HP (" + player.getLifeLevel() + "HP).");
            }
        }

    }


}
