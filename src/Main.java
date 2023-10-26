import Game.Game;

import java.util.Scanner;

//---------------------------------------- CONSTRUCTORS -----------------------------------

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Menu menu = new Menu(scanner);
        menu.displayMenu();
    }
}