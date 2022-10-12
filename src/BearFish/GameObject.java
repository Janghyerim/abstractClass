package BearFish;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public abstract class GameObject {
	protected int distance; //이동거리
	protected int x,y; //현위치(화면 맵상 위치)
	
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}
	}
	
	protected abstract void move();
	protected abstract char getShape();
	
	

	

}
