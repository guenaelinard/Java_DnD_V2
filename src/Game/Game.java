package Game;

import Ennemies.Gobbo;
import Items.healing.LesserPotion;
import Items.weapons.Sword;

import java.util.ArrayList;

public class Game {
    ArrayList<iSquare> board;


    int posPlayer;

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Game() {
    }

    //-------------------------------- METHODS --------------------------------

    public void initBoard() {
        board = new ArrayList<>(64);
        for (int i = 0; i < 63; i++) {
            switch (i) {
                case 2 -> board.add(new Gobbo());
                case 3 -> board.add(new Sword());
                case 4, 5 -> board.add(new LesserPotion());
                default -> board.add(new EmptySquare());
            }
        }
        while (posPlayer < 64) {
            movePlayer();
            getCurrentSquare();
            System.out.println("You arrived on Square " + posPlayer +".");

        }
    }


    public void movePlayer() {
        int rollDice = (int) (Math.random() * 6 + 1);
        System.out.println("You rolled a " + rollDice);
        posPlayer += rollDice;
    }


    public iSquare getCurrentSquare() {
        return board.get(getPosPlayer() - 1);
    }

    //-------------------------------- GET/SET --------------------------------
    public int getPosPlayer() {
        return posPlayer;
    }

    public void setPosPlayer(int posPlayer) {
        this.posPlayer = posPlayer;
    }
}

