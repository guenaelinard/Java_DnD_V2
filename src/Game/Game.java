package Game;

import java.util.ArrayList;

public class Game {
    ArrayList<Square> board;

    int posPlayer;

    public Game() {
    }

    public void initBoard() {
        board = new ArrayList<>(64);
        posPlayer = 1;
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 1 -> board.add(0, new EmptySquare());
                case 2 -> board.add(1, new EnemySquare());
                case 3 -> board.add(2, new LootSquare());
                case 4 -> board.add(3, new HealingSquare());
            }
        }

    }

    public int getPosPlayer() {
        return posPlayer;
    }

    public void movePlayer() {
        int rollDice = (int)(Math.random() *6 +1);
        posPlayer += rollDice;

    }

    public void currentSquare(){
        int currentSquare = posPlayer -1;
    }
}

