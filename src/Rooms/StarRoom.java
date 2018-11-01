package Rooms;

import Game.Runner;
import People.Person;

public class StarRoom extends Room{
    public StarRoom(int x, int y) {
        super(x, y);
    }
    public void enterRoom(Person x){
        System.out.println("You encounter a brilliantly burning star!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
