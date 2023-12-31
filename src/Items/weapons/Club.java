package Items.weapons;

import Characters.Player;

import java.util.Scanner;

public class Club extends OffensiveItem {

    //-------------------------------- CONSTRUCTORS --------------------------------

    public Club() {
        super("Club", 3);
    }

    //-------------------------------- METHODS --------------------------------

    public void checkWeaponCompatibilityForClass(Player player) {
        if (!player.getCharClass().equals("Warrior")) {
            System.out.println("You can't equip this item.");
        } else {
            super.interaction(player);
        }
    }

    @Override
    public void interaction(Player player) {
        System.out.println("You found a " + this.getWeaponName() + " ! (Attack Power : " + this.getWeaponAttackLevel() + ")");
        System.out.println("Do you wish to equip this weapon ? yes/no");
        Scanner scanner = new Scanner(System.in);
        String weaponChoice = scanner.next();
        if (weaponChoice.equalsIgnoreCase("yes") || weaponChoice.equalsIgnoreCase("y")) {
            checkWeaponCompatibilityForClass(player);
        } else if (weaponChoice.equalsIgnoreCase("no") || weaponChoice.equalsIgnoreCase("n")) {
            System.out.println("You leave the " + this.getWeaponName() + " behind.");
        } else {
            System.out.println("Your lone braincell does not compute.");
        }
    }


    //---------------------------------- TO STRING -----------------------------------


}

