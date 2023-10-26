package Items.weapons;

public class Sword extends OffensiveItem {

    public Sword(){
        super("Sword", 5);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction() {
        System.out.println("You found a Sword ! (Attack Power : " + this.getWeaponAttackLevel() + ")");
    }


    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return "You found a Sword\n Power : " + this.getWeaponAttackLevel();
    }
}
