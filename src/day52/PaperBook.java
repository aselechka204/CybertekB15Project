package day52;

public class PaperBook extends Book{

    int weight;
    public PaperBook(String name, String author, int weight){
        super(name, author);
        this.weight=weight;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Paper Book name is "+name+" and the author is "+author+" and it weight "+weight);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                '}';
    }
    public void takeNotes(){
        System.out.println("bookmark and taking note from "+ name);
    }
    public void read(){
        System.out.println("reading the "+ name+" written by "+author);
    }
}
