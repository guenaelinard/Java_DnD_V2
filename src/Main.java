import BDD.DbCRUD;
import Game.outOfBoundsCharacterException;

import java.sql.SQLException;
import java.util.*;


//---------------------------------------- CONSTRUCTORS -----------------------------------

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Menu menu = new Menu(scanner);
        try {
        menu.displayMenu();
        } catch (outOfBoundsCharacterException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}