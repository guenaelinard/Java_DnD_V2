package Game;

public class EmptySquare implements iSquare {

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public EmptySquare() {
    }

    //-------------------------------- METHODS --------------------------------

    @Override
    public void interaction() {
        System.out.println("The echoes of your own footsteps reverberate maddeningly in the empty room...");
    }
}
