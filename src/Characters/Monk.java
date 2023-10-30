package Characters;

import Items.protections.Bracers;
import Items.weapons.MandaleDeForain;

public class Monk extends Player {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Monk(String charName){
        super(charName, "Monk", 15, 20, 15, new MandaleDeForain(), new Bracers());

    }
}
