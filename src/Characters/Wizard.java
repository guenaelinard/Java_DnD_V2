package Characters;

import Items.protections.ProtectSpell;
import Items.weapons.EmberStaff;


public class Wizard extends Character {

    public Wizard(String charName) {
        super(charName, "Wizard", 5, 16, new EmberStaff("Ember Staff"), new ProtectSpell("Spell : Protect"));
    }

//    public void changeClassFromWizardToWarrior() {
//        this.setCharClass("Warrior");
//        this.setCharLifeLevel(10);
//        this.setCharStrength(10);
//        this.setOffensiveItem(new Sword("Sword"));
//        this.setDefensiveItem(new Shield("Shield"));
//
//    }

}
