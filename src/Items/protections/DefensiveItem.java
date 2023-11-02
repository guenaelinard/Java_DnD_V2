package Items.protections;

import Characters.Player;
import Game.ISquare;

public abstract class DefensiveItem implements ISquare {

    protected String defenseName;
    protected int defenseProtectionLevel;

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public DefensiveItem(String name, int protectionLevel) {
        defenseName = name;
        defenseProtectionLevel = protectionLevel;
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
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

