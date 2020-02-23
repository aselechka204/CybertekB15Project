package day50;

public class Square extends Shape {

    //string name;
    //double area;
    int length;

    public Square(String name, int length) {
        super(name);  //reusing functionality of super class
        this.length=length;
    }

    @Override
    public void calculateArea() {
        area=length*length; // this is how we calculate area of square

    }

    @Override
    public void draw(){
        System.out.println("Draw 4 equal line with 90 degree , length "+length+ "with color"+ COLOR);
    }
    // public abstract void calculatedArea();
    //public abstact void draw();


    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
