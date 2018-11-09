package Rooms;

import Game.Runner;
import People.Person;

import java.util.Scanner;

public class GaseousPlanetRoom extends Room
{

	public GaseousPlanetRoom(int x, int y) { super(x, y); }
	public void enterRoom(Person x) {
		Scanner command = new Scanner(System.in);
		System.out.println("Aliens from the Gas Giant attack!!!!");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	

}
