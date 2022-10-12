package abstractClass;

public abstract class AbstractC {
	//추상클래스 정의
	//1. abstract 제한을 붙여서 클래스를 선언한다.
	//2. 일반클래스와 동일하게 멤버를 정의한다.
	//3. 추상메소드를 정의한다.(선언부만 존재)
	//4. 생성이 불가하다.
	//5. 반드시 서브(자식)클래스에 상속해야 된다.(상속을 위한 클래스)
	//6. 서브클래스는 반드시 추상 메소드를 오버라이딩 해야한다.
	//7. 추상메소드 -> 필수기능, 오버라이딩(강제구현)
	
	int x;  
	
	AbstractC(){  //생성자
		
	}
	
	void method() { //일반메소드의 선언과 구현문
		
	}
	
	abstract void abstractMethod(); //추상메소드는 선언만 한다. 구현부 X ({ })

}
