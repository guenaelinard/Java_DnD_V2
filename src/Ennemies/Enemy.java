package Ennemies;

import Characters.Player;
import Game.Game;
import Game.iSquare;

public abstract class Enemy implements iSquare {


    private String enemyName;
    private int enemyLifeLevel;

    private int enemyStrength;


    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Enemy(){
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        while (this.getEnemyLifeLevel() > 0 && player.getCharLifeLevel() > 0){
            this.enemyLifeLevel -= player.getChatAttackLevel();
            System.out.println("You hit the " + this.enemyName + " for " + player.getChatAttackLevel() + " !");
            if (this.getEnemyLifeLevel() > 0) {
                player.setCharLifeLevel(player.getCharLifeLevel() - this.enemyStrength);
                System.out.println("The " + this.enemyName + " hits back ! You've lost " + this.enemyStrength + "HP.");
                if (player.getCharLifeLevel() <= 0){
                    System.out.println("As everything goes dark around you, your hear the laugh of the " + this.enemyName + " who slaughtered you...\n GAME OVER");
                    break;
                } else {
                    System.out.println("(Remaining : " + player.getCharLifeLevel() + "HP).");
                }
            } else {
                System.out.println("You've slain the " + this.enemyName + " !");
            }
        }
    }

    //-------------------------------- GET/SET --------------------------------

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String name) {
        this.enemyName = name;
    }

    public int getEnemyLifeLevel() {
        return enemyLifeLevel;
    }

    public void setEnemyLifeLevel(int liveLevel) {
        this.enemyLifeLevel = liveLevel;
    }

    public int getEnemyStrength() {
        return enemyStrength;
    }

    public void setEnemyStrength(int strength) {
        this.enemyStrength = strength;
    }


}
