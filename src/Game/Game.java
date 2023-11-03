package Game;

import Characters.Player;
import Enemies.Dragon;
import Enemies.Gobbo;
import Enemies.Sorcerer;
import Items.healing.GreaterPotion;
import Items.healing.LesserPotion;
import Items.weapons.Club;
import Items.weapons.FireballStaff;
import Items.weapons.Sword;
import Items.weapons.ThunderboltStaff;

import java.util.*;

public class Game implements ISquare {
    protected ArrayList<ISquare> board;

    protected boolean gameIsOver = false;

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Game() {
    }

    //-------------------------------- METHODS --------------------------------
    public void playGame(Player player) throws outOfBoundsCharacterException {
        initBoard();
        gameIsOver = false;
        while (player.getPosPlayer() < 64 && player.getCharLifeLevel() >= 0) {
            if (!player.isRanAwayFromFight()) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter 'd' to roll the dice.");
                    String rollDiceAction = scanner.next();
                    if (rollDiceAction.equalsIgnoreCase("d")) {
                        movePlayer(player);
                    }
                } catch (outOfBoundsCharacterException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                runAwayFromFight(player);
            }
        } if (player.getPosPlayer() >= 64) {
            victoryScreen();
            initBoard();

        }
    }


    public void initBoard() {
        board = new ArrayList<ISquare>();
        for (int i = 1; i < 64; i++) {
            switch (i) {
                case 45, 52, 56, 62 -> board.add(new Dragon());
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> board.add(new Sorcerer());
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> board.add(new Gobbo());
                case 2, 11, 5, 22, 38 -> board.add(new Club());
                case 19, 26, 42, 53 -> board.add(new Sword());
                case 1, 4, 8, 17, 23 -> board.add(new ThunderboltStaff());
                case 48, 49 -> board.add(new FireballStaff());
                case 7, 13, 31, 33, 39, 43 -> board.add(new LesserPotion());
                case 28, 41 -> board.add(new GreaterPotion());
                default -> board.add(new EmptySquare());
            }
            Collections.shuffle(board);
        }
    }
    public void movePlayer(Player player) throws outOfBoundsCharacterException {
        int rollDice = (int) (Math.random() * 6 + 1);
        System.out.println("You rolled a " + rollDice);
        player.setPosPlayer(player.getPosPlayer() + rollDice);
        if (player.getPosPlayer() > 63) {
            throw new outOfBoundsCharacterException();
        }
        System.out.println("You arrived on Square " + player.getPosPlayer());
        getCurrentSquare(player).interaction(player);
    }

    public void runAwayFromFight(Player player) throws outOfBoundsCharacterException {
        int runAwayDice = (int) (Math.random() * 6 + 1);
        player.setPosPlayer(player.getPosPlayer() - runAwayDice);
        System.out.println("You ran away and went back to Square " + player.getPosPlayer() + "!");
        if (player.getPosPlayer() < 0) {
            throw new outOfBoundsCharacterException();
        }
        player.setRanAwayFromFight(false);
    }

    public void victoryScreen(){
        gameIsOver = true;
        System.out.println("You've vanquished the Dungeon !");
    }

    public ISquare getCurrentSquare(Player player) {
        return board.get(player.getPosPlayer() - 1);
    }



    @Override
    public void interaction(Player player) {
    }


    //-------------------------------- GET/SET --------------------------------

}

