package Ennemies;

import Characters.Player;
import Game.iSquare;

import java.util.Scanner;

public abstract class Enemy implements iSquare {


    private String enemyName;
    private int enemyLifeLevel;
    private int enemyStrength;

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Enemy() {
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        Scanner scanner = new Scanner(System.in);
        while (this.getEnemyLifeLevel() > 0 && player.getCharLifeLevel() > 0 && !player.isRanAwayFromFight()) {
            System.out.println("What will you do ?\n 1 - FIGHT\n 2 - RUN");
            int fightChoice = scanner.nextInt();
            switch (fightChoice) {
                case 1 -> {
                    this.enemyLifeLevel -= player.getCharAttackLevel();
                    System.out.println("You hit the " + this.enemyName + " for " + player.getCharAttackLevel() + " !");
                    if (this.getEnemyLifeLevel() > 0) {
                        player.setCharLifeLevel(player.getCharLifeLevel() - this.enemyStrength);
                        System.out.println("The " + this.enemyName + " hits back ! You've lost " + this.enemyStrength + "HP.");
                        if (player.getCharLifeLevel() <= 0) {
                            System.out.println("As everything goes dark around you, your hear the laugh of the " + this.enemyName + " who slaughtered you...\n GAME OVER");
                        } else {
                            System.out.println("(Remaining : " + player.getCharLifeLevel() + "HP).");
                        }
                    } else {
                        System.out.println("You've slain the " + this.enemyName + " !");
                    }
                }
                case 2 -> {
                    System.out.println("You ran away !");
                    player.setRanAwayFromFight(true);
                }
                default -> throw new IllegalStateException("Unexpected value: " + fightChoice);
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
