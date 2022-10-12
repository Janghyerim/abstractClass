package com.java.Unit;

public class UnitTest {

	public static void main(String[] args) {
		
		Tank t = new Tank(150);
		DropShip d = new DropShip(125);
		SCV s = new SCV(40);
		
		
		Medic m = new Medic(50);
		Marine mr = new Marine(40);
		
		s.repair(d);
		s.repair(t);
		s.repair(s);
		m.human(m);
		m.human(mr);
		

	}

}
