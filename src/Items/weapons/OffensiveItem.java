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

    public OffensiveItem(String name) {
        weaponName = name;
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {

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