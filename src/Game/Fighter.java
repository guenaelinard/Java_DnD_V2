package Game;

public interface Fighter {

     int attacks();

     void receives(Fighter opponent);

     int getLifeLevel();

    default boolean isAlive() {
        return this.getLifeLevel() > 0;
    }
}
