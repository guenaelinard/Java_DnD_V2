package Items.weapons;

import Characters.Player;
import Game.ISquare;

public abstract class OffensiveItem implements ISquare {

    private String weaponName;
    private int weaponAttackLevel;

    //----------------------------------- CONSTRUCTORS ------------------------

    public OffensiveItem(String name, int attackLevel) {
        weaponName = name;
        weaponAttackLevel = attackLevel;
    }


    //-------------------------------- METHODS --------------------------------

    public void checkNewWeapon(Player player) {
        player.getOffensiveItem().setWeaponName(this.weaponName);
        player.getOffensiveItem().setWeaponAttackLevel((this.weaponAttackLevel));
        player.setCharAttackLevel(player.getCharStrength() + this.getWeaponAttackLevel());
    }

    /**
     * Method to interact with the player and determine the output of it.
     * @param player the current player who initiated the interaction.
     *               inherited from the interface {@link ISquare}
     */
    @Override
    public void interaction(Player player) {
        if (player.getOffensiveItem().getWeaponAttackLevel() < this.getWeaponAttackLevel()) {
            checkNewWeapon(player);
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