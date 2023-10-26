package Items.protections;

import Game.iSquare;

public abstract class DefensiveItem implements iSquare {

    private String defenseName;
    private int defenseProtectionLevel;

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public DefensiveItem(String name, int protectionLevel) {
        defenseName = name;
        defenseProtectionLevel = protectionLevel;
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction() {
    }

    //------------------------------------ GET/SET ----------------------------

    public String getDefenseName() {
        return defenseName;
    }

    public void setDefenseName(String defenseName) {
        this.defenseName = defenseName;
    }

    public int getDefenseProtectionLevel() {
        return defenseProtectionLevel;
    }
    public void setDefenseProtectionLevel(int defenseProtectionLevel) {
        this.defenseProtectionLevel = defenseProtectionLevel;
    }

    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return this.defenseName ;
    }
}

