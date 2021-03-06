package day45;

public class Book extends Object {

    //if we do not explicitly (visibly, manually extends another class)
    //we always automatically extend object class
    //object class is super class of all the classes in Java
    public static void main(String[] args) {

        Book b1= new Book();

        System.out.println("b1.toString() = " + b1.toString());
    }
     @Override  // this called annotation, it is making it obvious to declare we are rewriting the inherited super class method
    public String toString(){
        return "my own version of toString";
    }
}
