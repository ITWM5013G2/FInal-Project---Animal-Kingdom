// This defines a simple class of critters that sit around waiting to be
// taken over by other critters.

import java.awt.*;

public class Giant extends Critter {

    int moves;
    public Giant (){
        getColor();
    }

    public Critter.Action getMove(CritterInfo info) {
        moves++;

        if (moves > 24){
            moves = 0;
        }
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }

        else if (info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }

        else {
            return Action.LEFT;
        }

    }

    public Color getColor() {
        return Color.gray;
    }

    public String toString() {

        switch (moves/6){
            case 1:
                return "fee";
            case 2:
                return "fie";
            case 3:
                return "foe";
            default:
                return "fum";
        }
    }
}
