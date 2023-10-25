package Characters;

import Items.protections.Bracers;
import Items.protections.DefensiveItem;
import Items.weapons.MandaleDeForain;
import Items.weapons.OffensiveItem;

public abstract class Character { //création de ma classe avec ses keys
    private String charClass;
    private String charName;
    private int charLifeLevel;
    private int charStrength;

    private OffensiveItem offensiveItem;
    private DefensiveItem defensiveItem;


    //---------------------------------------- CONSTRUCTORS -----------------------------------
    public Character() { //constructeur par défaut (sans paramètres)
        charName = "Zob";
        charClass = "Monk";
        charLifeLevel = 15;
        charStrength = 15;
        this.offensiveItem = new MandaleDeForain("Mandale de Forain");
        this.defensiveItem = new Bracers("Bracers");
    }

    public Character(String name) { //constructeur avec deux paramètres
        charName = name;
        charClass = "Monk";
        charLifeLevel = 15;
        charStrength = 15;
        this.offensiveItem = new MandaleDeForain("Mandale de Forain");
        this.defensiveItem = new Bracers("Bracers");
    }

    public Character(String name, String jobClass, int lifeLevel, int Strength, OffensiveItem offensiveItem, DefensiveItem defensiveItem) { //constructeur complet
        charName = name;
        charClass = jobClass;
        charLifeLevel = lifeLevel;
        charStrength = Strength;
        this.offensiveItem = offensiveItem;
        this.defensiveItem = defensiveItem;
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
                "\n             Weapon : " + this.offensiveItem +
                "\n             Defense : " + this.defensiveItem;

    }
}
