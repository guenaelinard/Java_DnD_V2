package Game;

import Items.healing.LesserPotion;

public class HealingSquare extends Square{

    public HealingSquare(){
        LesserPotion lesserPotion = new LesserPotion();
        System.out.println("You found a Lesser Potion of Healing !" + lesserPotion);
    }
}
