package Items.healing;

import Characters.Player;

public class GreaterPotion extends HealingItems {

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public GreaterPotion() {
        this.name = "Greater Potion of Healing";
        this.healValue = 5;
    }

    //----------------------------------------- METHODS --------------------------------------

    @Override
    public void interaction(Player player) {
        super.interaction(player);
    }


    //-------------------------------- GET/SET --------------------------------


    //---------------------------------- TO STRING -----------------------------------
    @Override
    public String toString() {
        return "You found a Greater Potion of Healing ! (Healing power : " + healValue + ")";
    }

}
