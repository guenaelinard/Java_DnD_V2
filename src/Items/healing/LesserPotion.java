package Items.healing;

import Characters.Player;

public class LesserPotion extends HealingItems{

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public LesserPotion(){
        this.name = "Lesser Potion of Healing";
        this.healValue = 2;
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
        return "You found a Lesser Potion of Healing ! (Healing power : " + healValue +")";
    }

}
