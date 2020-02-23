package day52;

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author, double duration){
        super(name, author);
        this.duration=duration;
    }
    public void displayInfo(){
        System.out.println("The name of audioBook is " + name + " and " + "the author is " + author +
                ", the duration is " + duration + " min.");
    }
    public void takeNotes(){
        System.out.println("Taking notes on the digital book by " +
                "writing the provided digital table");
    }
    public void showTableOfContent() {

    }

    @Override
    public void displayBookInfo() {

    }

}