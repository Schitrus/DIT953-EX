import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Square extends Polygon{
	public Square(int x, int y){
		super(x, y);
	
	}
	@Override
	public void paint(Graphics g){
		g.drawRect(centerPoint.x -10, centerPoint.y -10, 20, 20);
	}

	@Override
	public boolean overlaps(Polygon p){
		System.out.println("Square.overlaps:" + this.toString() + " vs " + p.toString());
		return true;
	}

}