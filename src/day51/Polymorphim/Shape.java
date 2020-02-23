package day51.Polymorphim;

public abstract class Shape {

    public abstract void draw();


}

  class Triangle extends Shape {


      @Override
      public void draw() {
          System.out.println("drawing triangle");
      }
  }

      class Rectangle extends Shape {

          @Override
          public void draw() {
              System.out.println("draw rectangle");

          }
      }
      class Circle extends Shape{

          @Override
          public void draw() {
              System.out.println("draw circle");

          }
      }



