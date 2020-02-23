package day47;

public abstract class Shape {
    String name;
    int area;

    public Shape(String name) {
    this.name=name;

    }
    public abstract void calculateArea();

    @Override
    public abstract String toString();


    // add a constructor to set these name values
    // add abstract method called calculateArea
    //add two concrete class of Shape:
    // Triangle-int height and base
    // implement calculateArea method
    // Rectangle - instance field : width and height
}
