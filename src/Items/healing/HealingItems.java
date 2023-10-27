package Items.healing;

import Characters.Player;
import Game.iSquare;

public abstract class HealingItems implements iSquare {

    String name;

    int healValue;


    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {

    }


}
