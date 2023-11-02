package Enemies;

import Characters.Player;
import Game.Fighter;
import Game.ISquare;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Enemy implements ISquare, Fighter {


    protected String enemyName;
    protected int enemyLifeLevel;
    protected int enemyStrength;


    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Enemy() {
    }

    //-------------------------------- METHODS --------------------------------

    public void interaction(Player player) {
        encounterPlayer(player);
    }
    public void enemyAttack(Player player) {
        if (this.isAlive()) {
            player.receives(this);
            System.out.println("The " + this.enemyName + " hits back ! You've lost " + this.enemyStrength + "HP.");
            if (player.isAlive()) {
                System.out.println("(Remaining : " + player.getLifeLevel() + "HP).");
            } else {
                System.out.println("As everything goes dark around you, your hear the laugh of the " + this.enemyName + " who slaughtered you...\n GAME OVER");
            }
        } else {
            System.out.println("You've slain the " + this.enemyName + " !");
        }
    }
    private void encounterPlayer(Player player) {
        Scanner scanner = new Scanner(System.in);
        while (this.isAlive() && player.isAlive() && !player.isRanAwayFromFight()) {
            System.out.println("What will you do ?\n 1 - FIGHT\n 2 - RUN");
            int fightChoice = scanner.nextInt();
            switch (fightChoice) {
                case 1 -> {
                    this.receives(player);
                    System.out.println("You hit the " + this.enemyName + " ! (Enemy HPs : " + this.getLifeLevel() + ")");
                    enemyAttack(player);
                }
                case 2 -> {
                    System.out.println("You ran away !");
                    player.setRanAwayFromFight(true);
                }
                default -> throw new InputMismatchException("Unexpected value: " + fightChoice);
            }
        }
    }

    @Override
    public void receives(Fighter opponent){
        this.enemyLifeLevel -= opponent.attacks();
    }
    @Override
    public int attacks() {
        return this.enemyStrength;
    }
    @Override
    public int getLifeLevel() {
        return this.enemyLifeLevel;
    }
    @Override
    public boolean isAlive() {
        return this.enemyLifeLevel > 0;
    }

    //-------------------------------- GET/SET --------------------------------

    public String getEnemyName() {
        return enemyName;
    }
    public int getEnemyStrength() {
        return enemyStrength;
    }
    protected void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    protected void setEnemyLifeLevel(int enemyLifeLevel) {
        this.enemyLifeLevel = enemyLifeLevel;
    }

    protected void setEnemyStrength(int enemyStrength) {
        this.enemyStrength = enemyStrength;
    }

}
