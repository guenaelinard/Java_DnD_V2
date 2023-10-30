//package Items.weapons;
//
//import Characters.Player;
//
//import java.util.Scanner;
//
//public class PhysicalWeapon extends OffensiveItem {
//
//    //-------------------------------- CONSTRUCTORS --------------------------------
//
//    public PhysicalWeapon(String name, int attackLevel) {
//        super(name, attackLevel);
//    }
//
//    public PhysicalWeapon(String name) {
//        super(name);
//    }
//
//    //-------------------------------- METHODS --------------------------------
//
//
//    @Override
//    public void interaction(Player player) {
//        System.out.println("You found a " + getWeaponName() + "!\n" + this);
//        System.out.println("Do you wish to equip this weapon ? yes/no");
//        Scanner scanner = new Scanner(System.in);
//        String weaponChoice = scanner.next();
//        if (weaponChoice.equalsIgnoreCase("yes")){
//            if (!player.getCharClass().equals("Warrior")){
//                System.out.println("You can't equip this item.");
//            } else {
//                player.setOffensiveItem(new PhysicalWeapon(getWeaponName()));
//                System.out.println("You've equipped the " + this.getWeaponName() + ".");
//            }
//        } else {
//            System.out.println("You leave the " + this.getWeaponName() + " behind.");
//        }
//
//    }
//}