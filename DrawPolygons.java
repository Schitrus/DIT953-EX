import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    private ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>();

        polygons.add(new Square(100, 100));
        polygons.add(new Triangle(150, 150));
        polygons.add(new Rectangle(100, 200));

        for(Polygon p : polygons)
            for (Polygon s : polygons)
                p.overlaps(s);

        Triangle t = new Triangle(10, 10);
        Square s = new Square(90, 90);
        t.overlaps(t);
        t.overlaps(s);

    }//constructor

    @Override
    public void paint(Graphics g) {
        for (Polygon poly : polygons) {
            poly.paint(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

}//DrawPolygon
