package com.java.Unit;

public class Marine extends GroundUnit implements Human {

	Marine(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Marine";
	}


}
