package Items.weapons;

public abstract class OffensiveItem {

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