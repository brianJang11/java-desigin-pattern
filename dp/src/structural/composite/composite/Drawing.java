package structural.composite.composite;

import structural.composite.base.Shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    // collection of shapes
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape sh :
                shapes) {
            sh.draw(fillColor);
        }
    }

    // adding shape to drawing
    public void add(Shape s) {
        this.shapes.add(s);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }


}
