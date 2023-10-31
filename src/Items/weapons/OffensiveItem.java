package Items.weapons;

import Characters.Player;
import Game.iSquare;

public abstract class OffensiveItem implements iSquare {

    private String weaponName;
    private int weaponAttackLevel;

    //----------------------------------- CONSTRUCTORS ------------------------

    public OffensiveItem(String name, int attackLevel) {
        weaponName = name;
        weaponAttackLevel = attackLevel;
    }


    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        if (player.getOffensiveItem().getWeaponAttackLevel() < this.getWeaponAttackLevel()) {
            player.getOffensiveItem().setWeaponName(this.weaponName);
            player.getOffensiveItem().setWeaponAttackLevel((this.weaponAttackLevel));
            player.setCharAttackLevel(player.getCharStrength()+this.getWeaponAttackLevel());
            System.out.println("You've equipped the " + this.weaponName + ".");
        } else if (player.getOffensiveItem().getWeaponAttackLevel() == this.getWeaponAttackLevel()) {
            System.out.println("Why bother ? The power of your current weapon is equal.");
        } else {
            System.out.println("However, your weapon is stronger.");
        }
    }


    //------------------------------------ GET/SET ----------------------------

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponAttackLevel() {
        return weaponAttackLevel;
    }

    public void setWeaponAttackLevel(int weaponAttackLevel) {
        this.weaponAttackLevel = weaponAttackLevel;
    }


    //------------------------------------ TO STRING ----------------------------

    @Override
    public String toString() {
        return this.weaponName;
    }

}