package Characters;

import Items.protections.ProtectSpell;
import Items.weapons.EmberStaff;


public class Wizard extends Player {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Wizard(String charName) {
        super(charName, "Wizard", 3, 6, 8, new EmberStaff(), new ProtectSpell());
    }

}
