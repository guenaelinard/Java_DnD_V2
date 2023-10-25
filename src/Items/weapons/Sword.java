package Items.weapons;

public class Sword extends OffensiveItem {

    public Sword(String weaponName){
        super(weaponName, 5);
    }

    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return "Sword\n Power : " + this.getWeaponAttackLevel();
    }
}
