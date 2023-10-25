package Game;

import Items.weapons.Sword;

public class LootSquare extends Square{

    public LootSquare(){
        Sword sword = new Sword("Sword");
        System.out.println(sword);
    }
}
