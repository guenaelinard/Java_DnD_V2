package Items.weapons;

import Characters.Player;

public class Club extends OffensiveItem {

    //-------------------------------- CONSTRUCTORS --------------------------------

    public Club(){
        super("Club", 3);
    }

    //-------------------------------- METHODS --------------------------------
    @Override
    public void interaction(Player player) {
        System.out.println("You found a Club ! (Attack Power : " + this.getWeaponAttackLevel() + ")");
        if (!player.getCharClass().equals("Warrior")){
            System.out.println("You can't equip this item.");
        } else {
            player.setOffensiveItem(new Club());
            System.out.println("You've equipped the Club.");
        }
    }

    //---------------------------------- TO STRING -----------------------------------


}
