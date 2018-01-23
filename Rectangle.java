import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Rectangle extends Polygon{
	public Rectangle(int x, int y){
		super(x, y);
	
	}
	@Override
	public void paint(Graphics g){
		g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
	}

	@Override
	public boolean overlaps(Polygon p){
		System.out.println("Rectangle.overlaps:" + this.toString() + " vs " + p.toString());
		return true;
	}
		
}