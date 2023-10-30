import Characters.Player;
import Characters.Monk;
import Characters.Warrior;
import Characters.Wizard;
import Game.Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private boolean exit = false;

    private final Scanner scanner;

    Player player;
    Game game = new Game();

    //-------------------------------- CONSTRUCTORS ------------------------------------

    public Menu(Scanner scanner) {// constructeur de la classe Menu
        this.scanner = scanner;
    }

    //----------------------------------------- METHODS --------------------------------------

    /**
     * Allows the player to quit the game.
     */
    public void exitGame() { // Used when the option "Exit game" is chosen
//        System.out.println("Valeur d'exit avant : " + exit);
        exit = true;
//        System.out.println("Valeur d'exit après : " + exit) ;
    }

    /**
     * setups the initial menu to create a character.
     * When a character is created, allows to show its stats, to modify it, start the game or quit.
     */
    public void displayMenu(){ // Shows the Main Menu where you create your player
        Game game = new Game();
        while (!exit) {
            System.out.println("\n██████╗ ██████╗  ██████╗      ██╗███████╗ ██████╗████████╗           ██████╗ ██╗ ██████╗███████╗");
            System.out.println("██╔══██╗██╔══██╗██╔═══██╗     ██║██╔════╝██╔════╝╚══██╔══╝    ██╗    ██╔══██╗██║██╔════╝██╔════");
            System.out.println("██████╔╝██████╔╝██║   ██║     ██║█████╗  ██║        ██║       ╚═╝    ██║  ██║██║██║     █████╗  ");
            System.out.println("██╔═══╝ ██╔══██╗██║   ██║██   ██║██╔══╝  ██║        ██║       ██╗    ██║  ██║██║██║     ██╔══╝ ");
            System.out.println("██║     ██║  ██║╚██████╔╝╚█████╔╝███████╗╚██████╗   ██║       ╚═╝    ██████╔╝██║╚██████╗███████╗");
            System.out.println("╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚════╝ ╚══════╝ ╚═════╝   ╚═╝              ╚═════╝ ╚═╝ ╚═════╝╚══════╝\n");
            System.out.println("Select : ");
            System.out.println("1 - Create new Player\n2 - Exit game");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Player's name:");
                String playerName = scanner.next();
                System.out.println("Choose your class, " + playerName + ":");
                String playerClass = scanner.next();
                if (playerClass.equalsIgnoreCase("Warrior")) {
                    player = new Warrior(playerName);
                    System.out.println("Welcome, " + playerName + " the " + playerClass + ".");
                } else if (playerClass.equalsIgnoreCase("Wizard")) {
                    player = new Wizard(playerName);
                    System.out.println("Welcome, " + playerName + " the " + playerClass + ".");
                } else {
                    System.out.println("ERROR : Your class has been set by default.");
                    player = new Monk(playerName);
                }
            } else if (choice == 2) {
                exitGame();
                System.out.println("Thank you for playing.");
            }
            while (!exit) {
                System.out.println("\n1 - Start new Game\n2 - Show Player info\n3 - Modify Character\n4 - Exit game");
                int secondChoice = scanner.nextInt();
                switch (secondChoice) {
                    case 1 -> game.playGame(player);
                    case 2 -> showPlayerInfo(player);
                    case 3 -> modifyCharacter();
                    case 4 -> {
                        exitGame();
                        System.out.println("Thank you for playing.");
                    }
                }
            }
        }
    }


    public void modifyCharacter() {
        String name = player.getCharName();
        System.out.println("Choose your class, " + player.getCharName() + ":");
        String newPlayerClass = scanner.next();
        if (newPlayerClass.equalsIgnoreCase("Warrior")) {
            player = new Warrior(name);
        } else if (newPlayerClass.equalsIgnoreCase("Wizard")) {
            player = new Wizard(name);
        } else {
            System.out.println("ERROR : Your class has been set by default.");
            player = new Monk(name);
        }
    }

    public void showPlayerInfo(Player player) { //Display character stats
        System.out.println(player);
    }
}

