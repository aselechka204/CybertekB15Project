package day51.Polymorphim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
        Shape s4 = new Triangle();
        Shape s5 = new Rectangle();


        s1.draw();
        s2.draw();
        s3.draw();


        System.out.println("Shapes");

        Shape[] shapesList = {s1, s2, s3, s4, s5};
        for (int i = 0; i < shapesList.length; i++) {
            shapesList[i].draw();
        }

        System.out.println("Array list loop");

        List<Shape> lst2 = new ArrayList<>();
        lst2.addAll(Arrays.asList());
        for (int i = 0; i < lst2.size(); i++) {
            lst2.get(i).draw();
        }
    }
}