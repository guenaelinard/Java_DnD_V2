package Characters;

import Items.protections.*;
import Items.weapons.*;

public class Monk extends Player {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Monk(String charName){
        super(charName, "Monk", 15, 20, 15, new MandaleDeForain(), new Bracers());

    }
}
