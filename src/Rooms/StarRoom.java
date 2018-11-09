package Rooms;

import Game.Runner;
import People.Person;

import java.util.Scanner;

public class StarRoom extends Room{
    public StarRoom(int x, int y) {
        super(x, y);
    }
    public void enterRoom(Person x){
        Scanner answer = new Scanner(System.in);
        System.out.println("You encounter a brilliantly burning star!");
        System.out.println("Quickly type evade to avoid the dangerous solar flares!");
        String response = answer.next();
        if(response.equals("evade")){
            System.out.println("You're safe!");
        }
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
