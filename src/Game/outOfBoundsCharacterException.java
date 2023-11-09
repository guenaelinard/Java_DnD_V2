package Game;

import Characters.Player;
public class outOfBoundsCharacterException extends Exception {

    public int getPositionForException (Player player){
        return player.getPosPlayer();
    }
    public outOfBoundsCharacterException(Player player) {
        super("You went too far, you numskull !");
        System.out.println("Actual position : Square " + getPositionForException(player));
    }
}
