package BearFish;

public class Game {
	
	public static final int MAX_X = 20;
	public static final int MAX_Y = 10;
	
	private char[][] map = new char[MAX_Y][MAX_X]; //행 인덱스 : 0~9 , 열 인덱스 : 0~19
	private GameObject[] m = new GameObject[2];
	int state; //0 : 게임중  , 1 : 게임끝
	
	{
		System.out.println("========================");
		System.out.println("=====  Game Start  =====");
		System.out.println("========================");
		
	}
	
	public Game() {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				map[i][j] = '-';
			}
		}
		
		m[0]= new Bear(1,0,0);
		m[1]= new Fish(2,5,5);
		state = 0;
	}
	
	public void run() {
		System.out.println("** Bear의  Fish 먹기 게임을 시작합니다. **");
		update();  //배열에 'B'와 '@'를 x,y를 이용해서 넣어주는 역할
		draw();    //배열의 값을 출력
		
		while(!doesEnd()) { //물어보기  -> 충돌났을때 멈춰주게 하는 키워드 '!'
			clear();
			for(int i=0;i<m.length;i++) {
				m[i].move();
			}
			update();  
			draw();   
		}
		System.out.println("========================");
		System.out.println("=====  Game Over  =====");
		System.out.println("========================");
	}
	
	private void update() {  //배열에 'B'와 '@'를 x,y를 이용해서 넣어주는 역할
		for(int i=m.length-1;i>=0;i--) {
			map[m[i].getY()][m[i].getX()] = m[i].getShape();
		}
//		map[m[1].getX()][m[1].getY()] = m[1].getShape();
//		map[m[0].getX()][m[0].getY()] = m[0].getShape();
	}
	
	private void clear() {
		for(int i=0;i<m.length;i++) {
			map[m[i].getY()][m[i].getX()] = '-';
		}
	}
	
	
	private void draw() {  //배열의 값을 출력
		System.out.println();
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	
	private boolean doesEnd() { //충돌 유무기능
		if(m[0].collide(m[1])) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

