package Rooms;

import Game.Runner;
import People.Person;

public class SpaceStationRoom extends Room{
    public SpaceStationRoom(int x, int y) {
        super(x, y);
    }
    public void enterRoom(Person x){
        System.out.println("You run into a highly advanced space station orbiting an aquatic planet.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
