package Game;

import Ennemies.Gobbo;

public class EnemySquare extends Square{

    public EnemySquare(){
        Gobbo gobbo = new Gobbo("Gobbo");
        System.out.println(gobbo);
    }
}
