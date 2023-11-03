package BDD;

import Characters.Player;

import java.sql.*;

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
        PreparedStatement prepStatement = dnd_db.prepareStatement("INSERT INTO players (name, class, lifeLevel, maxLife, strength, offensiveItemID, defensiveItemID, posPlayer) VALUES (?,?,?,?,?,?,?,?)");
        prepStatement.setString(1, player.getCharName());
        prepStatement.setString(2, player.getCharClass());
        prepStatement.setInt(3, player.getLifeLevel());
        prepStatement.setInt(4, player.getCharMaxLife());
        prepStatement.setInt(5, player.getCharStrength());
        prepStatement.setString(6, player.getOffensiveItem().getWeaponName());
        prepStatement.setString(7, player.getDefensiveItem().getDefenseName());
        prepStatement.setInt(8, player.getPosPlayer());
        prepStatement.executeUpdate();
        prepStatement.close();

    }
}
