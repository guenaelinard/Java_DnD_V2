import Game.outOfBoundsCharacterException;

import java.util.*;


//---------------------------------------- CONSTRUCTORS -----------------------------------

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Menu menu = new Menu(scanner);
        try {
        menu.displayMenu();
        } catch (outOfBoundsCharacterException e) {
            throw new RuntimeException(e);
        }
    }
}