package abstractClass;

abstract public class Unit {
	int x,y;
	abstract void move(int x,int y); //서브클래스에 보낼때는 추상키워드 제외 후 작성하게 한다.
	void stop() {};
	
	}
