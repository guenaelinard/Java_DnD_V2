package Game;

public interface Fighter {

    public int attacks();

    public void receives(Fighter opponent);

    public int getLifeLevel();

    default boolean isAlive() {
        return this.getLifeLevel() > 0;
    }
}
