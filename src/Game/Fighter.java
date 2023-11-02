package Game;

public interface Fighter {

    int attacks();
    void receives(Fighter opponent);
    int getLifeLevel();
    boolean isAlive();
}
