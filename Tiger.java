// This defines a simple class of critters that sit around waiting to be
// taken over by other critters.

import java.awt.*;
import java.util.*;

public class Tiger extends Critter {

    int colorMoves;
    Color tigerColor;
    Random rand = new Random();

    public Tiger(){
        getColor();
    }

    public Color getColor() {
        //Randomly picks one of three colors (Color.RED, Color.GREEN, Color.BLUE) and uses that color for three moves,
        // then randomly picks one of those colors again for the next three moves,
        // then randomly picks another one of those colors for the next three moves, and so on.
        if (colorMoves%3==0){ // set new color
            int x=0;
            while (x==0){
                int i=rand.nextInt(3); //0.Red 1.Green 2.Black
                if (i==0 && this.tigerColor!=Color.RED){
                    this.tigerColor= Color.RED;
                    x++;
                } if (i==1 && tigerColor!=Color.GREEN){
                    this.tigerColor=Color.GREEN;
                    x++;
                } if (i==2 && tigerColor!=Color.BLUE){
                    this.tigerColor=Color.BLUE;
                    x++;
                }
            }
        }
        return tigerColor;
    }

    public String toString() {
        return "TGR";
    }

    public Critter.Action getMove(CritterInfo info) {

        colorMoves++;
        if (info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL){
            return Action.LEFT;
        } else if (info.getFront()==Neighbor.SAME){
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
