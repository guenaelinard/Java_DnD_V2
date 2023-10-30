package Items.weapons;

import Characters.Player;

public class Sword extends PhysicalWeapon {

    //-------------------------------- CONSTRUCTORS --------------------------------
    public Sword(){
        super("Sword", 5);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        super.interaction(player);
    }

    //---------------------------------- TO STRING -----------------------------------

}
