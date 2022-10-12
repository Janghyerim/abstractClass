package com.java.Unit;

public class SCV extends GroundUnit implements Repairable{

	SCV(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {  //SCV, Tank, DropShip
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리완료");
		}
		
	}


	//SVC,Tank,DropShip -> 인터페이스로 묶어주고 repair
	
	
	@Override
	public String toString() {
		return "SCV";
	}

}
