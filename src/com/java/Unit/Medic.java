package com.java.Unit;

public class Medic extends GroundUnit implements Human{

	Medic(int hp) { 
		super(hp);
		hitPoint = MAX_HP;
	}
	
	void human(Human h) {
		if(h instanceof Unit) {
			Unit u = (Unit)h;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� ġ��Ϸ�");
		}
	}
	
	//Medic, Marine -> �������̽��� �����ְ� Human
	
	@Override
	public String toString() {
		return "Medic";
	}
	

}
