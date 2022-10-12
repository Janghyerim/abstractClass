package com.java.Unit;

public class DropShip extends AirUnit implements Repairable{

	DropShip(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "DropShip";
	}

}
