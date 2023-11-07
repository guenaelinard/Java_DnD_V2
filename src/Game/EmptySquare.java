package Game;

import Characters.Player;

public class EmptySquare implements ISquare {

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public EmptySquare() {
    }

    //-------------------------------- METHODS --------------------------------

    /**
     * Method to interact with the player and determine the output of it.
     *
     * @param player the current player who initiated the interaction.
     */
    @Override
    public void interaction(Player player) {
        System.out.println("The echoes of your own footsteps reverberate maddeningly in the empty room...");
    }

    @Override
    public String toString() {
        return "Empty Square";
    }
}
