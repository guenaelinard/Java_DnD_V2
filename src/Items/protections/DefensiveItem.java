package Items.protections;

public abstract class DefensiveItem {

    private String defenseName;
    private int defenseProtectionLevel;


    public DefensiveItem(String name, int protectionLevel) {
        defenseName = name;
        defenseProtectionLevel = protectionLevel;
    }

    public DefensiveItem(String name){
        defenseName = name;
    }


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



    @Override
    public String toString() {
        return this.defenseName ;
    }
}

