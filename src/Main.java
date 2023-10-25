import Game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in) ;
        Menu menu = new Menu(scanner);
        menu.displayMenu();
    }
}