package Enemies;

import Characters.Player;
import Game.Fighter;
import Game.ISquare;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Enemy implements ISquare, Fighter {


    private final String enemyName;
    private int enemyLifeLevel;
    private final int enemyStrength;


    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Enemy(String enemyName, int enemyLifeLevel, int enemyStrength) {
        this.enemyName =enemyName;
        this.enemyLifeLevel = enemyLifeLevel;
        this.enemyStrength = enemyStrength;
    }

    //-------------------------------- METHODS --------------------------------

    /**
     * Method to interact with the player.
     * @param player the current player who initiated the interaction.
     *               inherited from the interface {@link ISquare}
     */
    public void interaction(Player player) {
        encounterPlayer(player);
    }

    /**
     * Method to attack the player and check if someone died afterward.
     * @param player the player the enemy is attacking.
     */
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

    /**
     * Method to determine which action will the player do next.
     * @param player the current player encountered.
     */
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

    /**
     * Method to reduce the enemy life points.
     * @param opponent the player the enemy is dealing with.
     */
    @Override
    public void receives(Fighter opponent){
        this.enemyLifeLevel -= opponent.attacks();
    }

    /**
     *
     * @return the enemy strength.
     *          inherited from the interface {@link Fighter}
     */@Override
    public int attacks() {
        return this.enemyStrength;
    }

    @Override
    public int getLifeLevel() {
        return this.enemyLifeLevel;
    }

    /**
     * Method to return a boolean checking if the enemy life points are above 0 or not.
     * @return a test if the enemy life points are above 0 or not.
     */
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

}
