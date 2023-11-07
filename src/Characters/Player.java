package Characters;

import Game.Fighter;
import Items.protections.*;
import Items.weapons.*;

public abstract class Player implements Fighter { //création de ma classe avec ses keys
    private String charClass;
    private String charName;
    private int charLifeLevel;
    private int charMaxLife;
    private int charStrength;
    private int charAttackLevel;
    private OffensiveItem offensiveItem;
    private DefensiveItem defensiveItem;
    private int posPlayer;
    private boolean ranAwayFromFight;

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Player() { //constructeur par défaut (sans paramètres)
        charName = "Mauricio";
        charClass = "Monk";
        charLifeLevel = 15;
        charStrength = 15;
        this.offensiveItem = new MandaleDeForain();
        this.defensiveItem = new Bracers();
        this.charAttackLevel = charStrength + this.offensiveItem.getWeaponAttackLevel();
        this.posPlayer = 1;
        this.ranAwayFromFight = false;
    }

    public Player(String name) { //constructeur avec deux paramètres
        charName = name;
        charClass = "Monk";
        charLifeLevel = 15;
        charStrength = 15;
        this.offensiveItem = new MandaleDeForain();
        this.defensiveItem = new Bracers();
        this.charAttackLevel = charStrength + this.offensiveItem.getWeaponAttackLevel();
        this.posPlayer = 1;
        this.ranAwayFromFight = false;
    }

    public Player(String name, String jobClass, int lifeLevel, int maxHP, int Strength, OffensiveItem offensiveItem, DefensiveItem defensiveItem) { //constructeur complet
        charName = name;
        charClass = jobClass;
        charLifeLevel = lifeLevel;
        charMaxLife = maxHP;
        charStrength = Strength;
        this.offensiveItem = offensiveItem;
        this.defensiveItem = defensiveItem;
        this.charAttackLevel = charStrength + this.offensiveItem.getWeaponAttackLevel();
        this.posPlayer = 1;
        this.ranAwayFromFight = false;
    }

    //-------------------------------- METHODS --------------------------------


    /**
     * Method to reset the player's position at the end of a game.
     */
    public void reinitializePosPlayer() {
        this.setPosPlayer(1);
    }

    /**
     * Returns the attack level of the player.
     *
     * @return the player attack level (their strength plus their weapons')
     */
    @Override
    public int attacks() {
        return this.charAttackLevel;
    }

    /**
     * Method to reduce the player's life points.
     *
     * @param opponent the enemy the player is dealing with.
     * @see #attacks()
     */
    @Override
    public void receives(Fighter opponent) {
        this.charLifeLevel -= opponent.attacks();
    }


    //-------------------------------- GET/SET --------------------------------

    @Override
    public int getLifeLevel() {
        return this.charLifeLevel;
    }

    public String getCharClass() {
        return charClass;
    }

    public String setCharClass(String charClass) {
        return this.charClass = charClass;
    }

    public String getCharName() {
        return charName;
    }

    protected void setCharName(String charName) {
        this.charName = charName;
    }


    public void setCharLifeLevel(int charLifeLevel) {
        this.charLifeLevel = charLifeLevel;
    }

    public int getCharMaxLife() {
        return charMaxLife;
    }

    protected void setCharMaxLife(int charMaxLife) {
        this.charMaxLife = charMaxLife;
    }

    public int getCharStrength() {
        return charStrength;
    }

    protected void setCharStrength(int charStrength) {
        this.charStrength = charStrength;
    }

    public int getCharAttackLevel() {
        return charAttackLevel;
    }

    public void setCharAttackLevel(int charAttackLevel) {
        this.charAttackLevel = charAttackLevel;
    }

    public void setOffensiveItem(OffensiveItem offensiveItem) {
        this.offensiveItem = offensiveItem;
    }

    public OffensiveItem getOffensiveItem() {
        return offensiveItem;
    }

    public DefensiveItem getDefensiveItem() {
        return defensiveItem;
    }

    protected void setDefensiveItem(DefensiveItem defensiveItem) {
        this.defensiveItem = defensiveItem;
    }

    public int getPosPlayer() {
        return posPlayer;
    }

    public void setPosPlayer(int posPlayer) {
        this.posPlayer = posPlayer;
    }

    public boolean isRanAwayFromFight() {
        return ranAwayFromFight;
    }

    public void setRanAwayFromFight(boolean ranAwayFromFight) {
        this.ranAwayFromFight = ranAwayFromFight;
    }

    //---------------------------------- TO STRING -----------------------------------

    /**
     * Method used to get all the information usable by the player.
     *
     * @return all the usable information.
     */
    @Override
    public String toString() { //Affichage des attributs du perso
        return "--             Player Info             --" +
                "\n             Name : " + charName +
                "\n             Class : " + charClass +
                "\n             LifePoints : " + charLifeLevel +
                "\n             Strength : " + charStrength +
                "\n             Attack Level : " + charAttackLevel +
                "\n             Weapon : " + this.offensiveItem +
                "\n             Defense : " + this.defensiveItem;

    }
}
