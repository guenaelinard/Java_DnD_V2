package BDD;

import Characters.Player;

import java.sql.*;
import java.util.Scanner;

public class DbCRUD {
    private Connection dnd_db;
    private DbConnector connector = DbConnector.getInstance();

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public DbCRUD() {
        try {
            String URL = "jdbc:mysql://localhost:3306/dnd_db";
            this.dnd_db = DriverManager.getConnection(URL, "root",
                    "root");
        } catch (SQLException e) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);

        }
    }

    public void dbCreateHero(Player player) throws SQLException {
        PreparedStatement prepStatement = connector.getConnection().prepareStatement("INSERT INTO players (name, class, lifeLevel, strength, offensiveItemID, defensiveItemID) VALUES (?,?,?,?,?,?)");
        prepStatement.setString(1, player.getCharName());
        prepStatement.setString(2, player.getCharClass());
        prepStatement.setInt(3, player.getLifeLevel());
        prepStatement.setInt(4, player.getCharStrength());
        prepStatement.setString(5, player.getOffensiveItem().getWeaponName());
        prepStatement.setString(6, player.getDefensiveItem().getDefenseName());
        prepStatement.executeUpdate();
        prepStatement.close();
        connector.getConnection().close();
    }

    public void dbLoadExistingPlayer(Player player) throws SQLException {
        PreparedStatement prepStatement = dnd_db.prepareStatement("SELECT * FROM players WHERE id = ?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the character you want to play :");
        int scannerChoice = scanner.nextInt();

    }



    public void dbDisplayHeroes() throws SQLException {
        PreparedStatement prepStatement = dnd_db.prepareStatement("SELECT * FROM players");
        ResultSet resultSet = prepStatement.executeQuery();
        while (resultSet.next()) {
            int ID = resultSet.getInt("ID");
            String name = resultSet.getString("name");
            String charClass = resultSet.getString("class");
            int liveLevel = resultSet.getInt("lifeLevel");
            int strength = resultSet.getInt("strength");
            System.out.println("\n     " + ID + "     Name : " + name + "     Class : " + charClass + "     LifePoints : " + liveLevel + "     Strength : " + strength);
        }
    }

    public void dbDeleteHero() throws SQLException {
        System.out.println("Please choose which character you want to delete :");
        dbDisplayHeroes();
        Scanner scanner = new Scanner(System.in);
        int ScannerChoice = scanner.nextInt();
        PreparedStatement prepStatement = dnd_db.prepareStatement("DELETE FROM players WHERE id = ?");
        prepStatement.setInt(1, ScannerChoice);
        prepStatement.executeUpdate();
        prepStatement.close();
    }
}
