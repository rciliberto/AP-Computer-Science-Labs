package lecture_22;
import java.util.ArrayList;

public class MovableDriver {
	public static void main(String[] args){
		Movable point=new MovablePoint(0,0);
		Movable circle=new MovableCircle(0,0,1);
		
		point.moveDown();
		point.moveLeft();
		
		circle.moveUp();
		circle.moveRight();
		
		System.out.println(point+"\n"+circle);
		
		Movable[] movables={point,circle};
		ArrayList<Movable> movableList=new ArrayList<Movable>();
	}
}
