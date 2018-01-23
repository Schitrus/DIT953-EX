import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Triangle extends Polygon{
	public Triangle(int x, int y){
		super(x, y);
	
	}
	@Override
	public void paint(Graphics g){
		g.drawLine(centerPoint.x, centerPoint.y-10, centerPoint.x-10, centerPoint.y+10);
            g.drawLine(centerPoint.x-10, centerPoint.y+10,
                        centerPoint.x+10, centerPoint.y+10);
            g.drawLine(centerPoint.x+10, centerPoint.y+10, centerPoint.x, centerPoint.y-10);
	}
		
	@Override
	public boolean overlaps(Polygon p){
		System.out.println("Triangle.overlaps:" + this.toString() + " vs " + p.toString());
		return true;
	}

}