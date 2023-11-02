package Game;

import Characters.Player;

public class EmptySquare implements ISquare {

    //---------------------------------------- CONSTRUCTORS -----------------------------------


    public EmptySquare() {
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction(Player player) {
        System.out.println("The echoes of your own footsteps reverberate maddeningly in the empty room...");
    }

    @Override
    public String toString() {
        return "Empty Square";
    }
}
