package Game;

import Characters.Player;
import Ennemies.Dragon;
import Ennemies.Gobbo;
import Ennemies.Sorcerer;
import Items.healing.GreaterPotion;
import Items.healing.LesserPotion;
import Items.weapons.Club;
import Items.weapons.FireballStaff;
import Items.weapons.Sword;
import Items.weapons.ThunderboltStaff;

import java.util.Scanner;
import java.util.ArrayList;

public class Game implements iSquare {
    ArrayList<iSquare> board;


    int posPlayer;

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Game() {
    }

    //-------------------------------- METHODS --------------------------------
    public void playGame(Player player) {
        initBoard();
        while (posPlayer < 64) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter 'd' to roll the dice.");
                String rollDiceAction = scanner.next();
                if (rollDiceAction.equalsIgnoreCase("d")) {
                    movePlayer();
                    System.out.println("You arrived on Square " + posPlayer);
                    getCurrentSquare().interaction(player);
                }
            } catch (outOfBoundsCharacterException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void initBoard() {
        board = new ArrayList<iSquare>();
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
        }
    }


    public void movePlayer() throws outOfBoundsCharacterException {
        int rollDice = (int) (Math.random() * 6 + 1);
        System.out.println("You rolled a " + rollDice);
        posPlayer += rollDice;
        if (posPlayer > 63) {
            throw new outOfBoundsCharacterException();
        }
    }


    public iSquare getCurrentSquare() {
        return board.get(posPlayer - 1);
    }


    @Override
    public void interaction(Player player) {
    }


    //-------------------------------- GET/SET --------------------------------
    public int getPosPlayer() {
        return posPlayer;
    }

    public void setPosPlayer(int posPlayer) {
        this.posPlayer = posPlayer;
    }

}

