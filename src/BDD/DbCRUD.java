package BDD;

import Characters.Player;

import java.sql.*;
import java.util.Scanner;

public class DbCRUD {
    private Connection dnd_db;

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

    public void dbCreateHero(Player player) throws SQLException{
        PreparedStatement prepStatement = dnd_db.prepareStatement("INSERT INTO players (name, class, lifeLevel, strength, offensiveItemID, defensiveItemID) VALUES (?,?,?,?,?,?)");
        prepStatement.setString(1, player.getCharName());
        prepStatement.setString(2, player.getCharClass());
        prepStatement.setInt(3, player.getLifeLevel());
        prepStatement.setInt(4, player.getCharStrength());
        prepStatement.setString(5, player.getOffensiveItem().getWeaponName());
        prepStatement.setString(6, player.getDefensiveItem().getDefenseName());
        prepStatement.executeUpdate();
        prepStatement.close();

    }

//    public void dbDisplayHeroes() throws SQLException{
//        PreparedStatement prepStatement = dnd_db.prepareStatement("SELECT * FROM `players`");
//        ResultSet resultSet = prepStatement.executeQuery();
//        while (resultSet.next()){
//           String name = prepStatement.getString("name");
//           String charClass = prepStatement.getString("class");
//           int liveLevel = prepStatement.getInt("lifeLevel");
//           int strength = prepStatement.getInt("strength");
//        }
//    }
    public void dbDeleteHero() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        int ScannerChoice = scanner.nextInt();
        PreparedStatement prepStatement = dnd_db.prepareStatement("DELETE FROM players WHERE id = ?");
        prepStatement.setInt(1, ScannerChoice);
        prepStatement.executeUpdate();
        prepStatement.close();
    }
}
