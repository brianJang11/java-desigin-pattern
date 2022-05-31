package structural.composite.tests;

import structural.composite.base.Shape;
import structural.composite.composite.Drawing;
import structural.composite.leaf.Circle;
import structural.composite.leaf.Triangle;

public class TestComposite {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape triangle1 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(triangle1);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(triangle);
        drawing.add(circle);
        drawing.draw("Green");

    }
}
