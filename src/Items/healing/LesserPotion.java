package Items.healing;

public class LesserPotion {

    String name;


    int healValue;


    public LesserPotion(){
        this.name = "Lesser Potion of Healing";
        this.healValue = 2;
    }

    //-------------------------------- GET/SET --------------------------------

    public int getHealValue() {
        return healValue;
    }

    //---------------------------------- TO STRING -----------------------------------

    @Override
    public String toString() {
        return "(Healing power : " + healValue +")";
    }
}
