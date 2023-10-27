package Items.weapons;

import Characters.Player;

public class FireballStaff extends OffensiveItem{

    //-------------------------------- CONSTRUCTORS --------------------------------
    public FireballStaff(){
        super("Fireball Staff", 8);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("You found a Fireball Staff ! (Attack Power : " + this.getWeaponAttackLevel() + ")");
        if (!player.getCharClass().equals("Wizard")){
            System.out.println("You can't equip this item.");
        } else {
            player.setOffensiveItem(new FireballStaff());
            System.out.println("You've equipped the Fireball Staff.");
        }
    }

    //---------------------------------- TO STRING -----------------------------------

}
