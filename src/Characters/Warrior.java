package Characters;

import Items.protections.Shield;
import Items.weapons.Sword;


public class Warrior extends Character {

    public Warrior(String charName) {
        super(charName, "Warrior", 10, 10, new Sword("Sword"), new Shield("Shield"));
    }

//    public void changeClassFromWarriorToWizard() {
//        this.setCharClass("Wizard");
//        this.setCharLifeLevel(5);
//        this.setCharStrength(16);
//        this.setOffensiveItem(new EmberStaff("Ember Staff"));
//        this.setDefensiveItem(new ProtectSpell("Spell : Protect"));
//
//    }

}
