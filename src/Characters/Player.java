package Characters;

import Enemies.Enemy;
import Game.Fighter;
import Items.protections.*;
import Items.weapons.*;

public abstract class Player implements Fighter { //création de ma classe avec ses keys
     String charClass;
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

//    public void reinitializePlayer(Player player){
//        if (player.getCharClass().equals("Warrior")){
//            player = new Warrior(player.getCharName());
//        }
//    }
    public void reinitializePosPlayer(){
        this.setPosPlayer(1);
    }
    @Override
    public int attacks(){
        return this.charAttackLevel;
    }
    @Override
    public void receives(Fighter opponent){
        this.charLifeLevel -= opponent.attacks();
    }
    @Override
    public int getLifeLevel(){
        return this.charLifeLevel;
    }
    @Override
    public boolean isAlive(){
        return this.charLifeLevel > 0;
    }

    //-------------------------------- GET/SET --------------------------------

    public String getCharClass() {
        return charClass;
    }
    public String setCharClass(String charClass){
        return this.charClass = charClass;
    }

    public String getCharName() {
        return charName;
    }
    protected void setCharName(String charName) {
        this.charName = charName;
    }

    public int getCharLifeLevel() {
        return charLifeLevel;
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

    protected void setOffensiveItem(OffensiveItem offensiveItem) {
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
    public boolean setRanAwayFromFight(boolean ranAwayFromFight) {
        return this.ranAwayFromFight = ranAwayFromFight;
    }

    //---------------------------------- TO STRING -----------------------------------

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
