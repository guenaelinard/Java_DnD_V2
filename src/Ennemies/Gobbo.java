package Ennemies;

public class Gobbo extends Enemy {


    public Gobbo(String name) {
        super(name);
        this.setLifeLevel(3);
        this.setStrength(1);
    }

    @Override
    public String toString() {
        return "Gobbo\n Health : " + this.getLifeLevel() + "\n Strength : " + this.getStrength();
    }
}
