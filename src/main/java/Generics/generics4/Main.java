package Generics.generics4;

import Generics.generics4.entities.Circle;
import Generics.generics4.entities.Rectangle;
import Generics.generics4.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: "+totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum  = 0.0;
        for (Shape shape: list) {
            sum+= shape.area();
        }
        return sum;
    }
}
