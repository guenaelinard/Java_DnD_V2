package Items.weapons;

import Characters.Player;

public class Sword extends OffensiveItem {

    //-------------------------------- CONSTRUCTORS --------------------------------
    public Sword(){
        super("Sword", 5);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("You found a Sword ! (Attack Power : " + this.getWeaponAttackLevel() + ")");
        if (!player.getCharClass().equals("Warrior")){
            System.out.println("You can't equip this item.");
        } else {
            player.setOffensiveItem(new Sword());
            System.out.println("You've equipped the Sword.");
        }
    }

    //---------------------------------- TO STRING -----------------------------------

}
