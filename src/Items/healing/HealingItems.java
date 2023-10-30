package Items.healing;

import Characters.Player;
import Game.iSquare;

public abstract class HealingItems implements iSquare {

    String name;

    int healValue;


    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("You found a " + this.name + ".");
        if (player.getCharLifeLevel() == player.getCharMaxLife()) {
            System.out.println("Your HP are already maxed out.");
        } else if (player.getCharLifeLevel() < player.getCharMaxLife()) {
            player.setCharLifeLevel(player.getCharLifeLevel() + this.healValue);
            if (player.getCharLifeLevel() > player.getCharMaxLife()){
                player.setCharLifeLevel(player.getCharMaxLife());
                System.out.println("You're full life !");
            } else {
                System.out.println("You've regained " + this.healValue + "HP (" + player.getCharLifeLevel() + "HP).");
            }
        }

    }


}
