package day47;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int width, int height){
       // i am reusing the functionality of super class
        super("my rectangle");
        this.height=height;
        this.width=width;
    }
    @Override
    public void calculateArea(){
        area=width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
