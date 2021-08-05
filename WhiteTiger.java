// This defines a simple class of critters that sit around waiting to be
// taken over by other critters.
import java.awt.*;

public class WhiteTiger extends Tiger {

    boolean infected = false;

    public Critter.Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            infected = true;
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }

    public Color getColor() {
        return Color.white;
    }

    public String toString() {
        if (infected == true) {
            return "tgr";
        } else {
            return "TGR";
        }
    }
}