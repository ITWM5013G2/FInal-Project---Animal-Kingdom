// This defines a simple class of critters that sit around waiting to be
// taken over by other critters.

import java.awt.*;
import java.sql.Struct;

public class Bear extends Critter {

    boolean polar;
    int step = 0;

    public Bear (boolean polar){
        this.polar = polar;
        getColor();
    }

    public Critter.Action getMove(CritterInfo info) {
        step++;
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

        if (true)
        return Color.white;
        else
        return Color.black;
    }

    public String toString() {

        if (step%2 == 0) {
            return "/";
        }
        else{
            return  "\\";
        }
    }
}
