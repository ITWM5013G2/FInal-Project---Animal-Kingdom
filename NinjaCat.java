// This defines a simple class of critters that sit around waiting to be
// taken over by other critters.
import java.awt.*;

public class NinjaCat extends Critter {

    public NinjaCat(){
        getColor();
    }

    public Critter.Action getMove(CritterInfo info) {

        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }

        else if (info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }

        else {
            return Action.RIGHT;
        }
    }

    public Color getColor() {
        return Color.black;
    }

    public String toString() {
        return "NC";
    }
}


