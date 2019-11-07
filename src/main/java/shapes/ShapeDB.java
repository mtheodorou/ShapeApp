package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    private ArrayList<Shape> list;

    public ShapeDB (){
        list = new ArrayList<Shape>();
    }
    public void add(Shape shape){
        list.add(shape);
    }
    public void addCircle(Point pos, Color col, int radians){
        list.add(new Circle(pos, col, radians));
    }
    public void addRect(Point pos, Color col, int width, int height){
        list.add(new Rectangle(pos, col, width, height));
    }
    public void addSquare(Point pos, Color col, int side){
        list.add(new Square(pos, col, side));
    }
    public ArrayList<Shape> getlist(){
        return list;
    }

}
