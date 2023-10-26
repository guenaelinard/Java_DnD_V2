package Ennemies;

public class Gobbo extends Enemy {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Gobbo() {
        this.setName("Gobbo");
        this.setLifeLevel(3);
        this.setStrength(1);
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction() {
        System.out.println("A Gobbo stands in your way !");
    }


    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return "Gobbo\n Health : " + this.getLifeLevel() + "\n Strength : " + this.getStrength();
    }
}
