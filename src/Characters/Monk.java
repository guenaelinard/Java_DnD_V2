package Characters;

import Items.protections.Bracers;
import Items.weapons.MandaleDeForain;

public class Monk extends Character {
    public Monk(String charName){
        super(charName, "Monk", 15, 15, new MandaleDeForain("Mandale de Forain"), new Bracers("Bracers"));

    }
}
