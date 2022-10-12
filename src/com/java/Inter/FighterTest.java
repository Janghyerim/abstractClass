package com.java.Inter;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Moveable ma = new Fighter(); //서브클래스를 슈퍼클래스에 넣어줌으로 업캐스팅
		Attackable aa = f; 
		
		               //클래스명 or 인터페이스 
		if(f instanceof Unit) {
			System.out.println("Unit은 조상 클래스이다.");
		}
		
		if(f instanceof Fighterable) {
			System.out.println("Fighterable은 조상 클래스이다.");
		}
		
		if(f instanceof Moveable) {
			System.out.println("Moveable은 조상 클래스이다.");
		}
	
	
	}

}
