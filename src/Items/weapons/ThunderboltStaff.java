package Items.weapons;

import Characters.Player;

public class ThunderboltStaff extends OffensiveItem {

    //-------------------------------- CONSTRUCTORS --------------------------------
    public ThunderboltStaff(){
        super("Thunderbolt Staff", 4);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("You found a Thunderbolt Staff ! (Attack Power : " + this.getWeaponAttackLevel() + ")");
        if (!player.getCharClass().equals("Wizard")){
            System.out.println("You can't equip this item.");
        } else {
            player.setOffensiveItem(new ThunderboltStaff());
            System.out.println("You've equipped the Thunderbolt Staff.");
        }
    }

    //---------------------------------- TO STRING -----------------------------------

}
