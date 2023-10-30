package Items.weapons;

import Characters.Player;

import java.util.Scanner;

public class ThunderboltStaff extends OffensiveItem {

    //-------------------------------- CONSTRUCTORS --------------------------------
    public ThunderboltStaff() {
        super("Thunderbolt Staff", 4);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("You found a " + this.getWeaponName() + " ! (Attack Power : " + this.getWeaponAttackLevel() + ")");
        System.out.println("Do you wish to equip this weapon ? yes/no");
        Scanner scanner = new Scanner(System.in);
        String weaponChoice = scanner.next();
        if (weaponChoice.equalsIgnoreCase("yes") || weaponChoice.equalsIgnoreCase("y")) {
            if (!player.getCharClass().equals("Wizard")) {
                System.out.println("You can't equip this item.");
            } else {
                super.interaction(player);
            }
        } else if (weaponChoice.equalsIgnoreCase("no") || weaponChoice.equalsIgnoreCase("n")) {
            System.out.println("You leave the " + this.getWeaponName() + " behind.");
        } else {
            System.out.println("Your lone braincell does not compute.");
        }
    }
    //---------------------------------- TO STRING -----------------------------------

}

