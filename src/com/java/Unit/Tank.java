package com.java.Unit;

public class Tank extends GroundUnit implements Repairable{

	Tank(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}

}
