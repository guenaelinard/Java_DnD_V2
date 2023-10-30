package Characters;

import Items.protections.Shield;
import Items.weapons.Sword;


public class Warrior extends Player {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Warrior(String charName) {
        super(charName, "Warrior", 5, 10, 5, new Sword(), new Shield());
    }


}
