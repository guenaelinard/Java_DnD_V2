package Characters;

import Items.protections.*;
import Items.weapons.*;


public class Warrior extends Player {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Warrior(String charName) {
        super(charName, "Warrior", 5, 10, 5, new NoWeapon(), new Shield());
    }


}
