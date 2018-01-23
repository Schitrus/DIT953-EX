import javax.swing.*;
import java.awt.*;
import java.util.*;

public abstract class Polygon{
	protected Point centerPoint;
	
	private Polygon(Point p){
		centerPoint = p;
		
	}
	public Polygon(int x, int y){
		this(new Point(x, y));
	
	}
	public abstract void paint(Graphics g);

	@Override
	public String toString(){
		return this.getClass().getName();
	}

	public boolean overlaps(Polygon p){
		System.out.println("Polygon.overlaps:" + this.toString() + " vs " + p.toString());
		return true;
	}

}