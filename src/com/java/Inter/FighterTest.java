package com.java.Inter;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Moveable ma = new Fighter(); //����Ŭ������ ����Ŭ������ �־������� ��ĳ����
		Attackable aa = f; 
		
		               //Ŭ������ or �������̽� 
		if(f instanceof Unit) {
			System.out.println("Unit�� ���� Ŭ�����̴�.");
		}
		
		if(f instanceof Fighterable) {
			System.out.println("Fighterable�� ���� Ŭ�����̴�.");
		}
		
		if(f instanceof Moveable) {
			System.out.println("Moveable�� ���� Ŭ�����̴�.");
		}
	
	
	}

}
