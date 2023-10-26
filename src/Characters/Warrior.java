package Characters;

import Items.protections.Shield;
import Items.weapons.Sword;


public class Warrior extends Player {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Warrior(String charName) {
        super(charName, "Warrior", 10, 10, new Sword(), new Shield());
    }


}
