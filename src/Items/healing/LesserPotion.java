package Items.healing;

public class LesserPotion extends HealingItems{



    public LesserPotion(){
        this.name = "Lesser Potion of Healing";
        this.healValue = 2;
    }

    @Override
    public String toString() {
        return "You found a Lesser Potion of Healing ! (Healing power : " + healValue +")";
    }

    //-------------------------------- GET/SET --------------------------------

    public int getHealValue() {
        return healValue;
    }

    //---------------------------------- TO STRING -----------------------------------

}
