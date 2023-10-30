package Characters;

import Items.protections.*;
import Items.weapons.*;

public abstract class Player { //création de ma classe avec ses keys
    private String charClass;
    private String charName;
    private int charLifeLevel;
    private int charMaxLife;
    private int charStrength;
    private int chatAttackLevel;

    private OffensiveItem offensiveItem;
    private DefensiveItem defensiveItem;


    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Player() { //constructeur par défaut (sans paramètres)
        charName = "Zob";
        charClass = "Monk";
        charLifeLevel = 15;
        charStrength = 15;
        this.offensiveItem = new MandaleDeForain();
        this.defensiveItem = new Bracers();
        this.chatAttackLevel = charStrength + this.offensiveItem.getWeaponAttackLevel();
    }

    public Player(String name) { //constructeur avec deux paramètres
        charName = name;
        charClass = "Monk";
        charLifeLevel = 15;
        charStrength = 15;
        this.offensiveItem = new MandaleDeForain();
        this.defensiveItem = new Bracers();
        this.chatAttackLevel = charStrength + this.offensiveItem.getWeaponAttackLevel();

    }

    public Player(String name, String jobClass, int lifeLevel, int maxHP, int Strength, OffensiveItem offensiveItem, DefensiveItem defensiveItem) { //constructeur complet
        charName = name;
        charClass = jobClass;
        charLifeLevel = lifeLevel;
        charMaxLife = maxHP;
        charStrength = Strength;
        this.offensiveItem = offensiveItem;
        this.defensiveItem = defensiveItem;
        this.chatAttackLevel = charStrength + this.offensiveItem.getWeaponAttackLevel();

    }

    //-------------------------------- METHODS --------------------------------


    //-------------------------------- GET/SET --------------------------------

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
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

    public void setCharMaxLife(int charMaxLife) {
        this.charMaxLife = charMaxLife;
    }

    public int getCharStrength() {
        return charStrength;
    }

    public void setCharStrength(int charStrength) {
        this.charStrength = charStrength;
    }
    public void setOffensiveItem(OffensiveItem offensiveItem) {
        this.offensiveItem = offensiveItem;
    }

    public DefensiveItem getDefensiveItem() {
        return defensiveItem;
    }

    public void setDefensiveItem(DefensiveItem defensiveItem) {
        this.defensiveItem = defensiveItem;
    }
    public OffensiveItem getOffensiveItem() {
        return offensiveItem;
    }

    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() { //Affichage des attributs du perso
        return "--             Player Info             --" +
                "\n             Name : " + charName +
                "\n             Class : " + charClass +
                "\n             LifePoints : " + charLifeLevel +
                "\n             Strength : " + charStrength +
                "\n             Attack Level : " + chatAttackLevel +
                "\n             Weapon : " + this.offensiveItem +
                "\n             Defense : " + this.defensiveItem;

    }
}
