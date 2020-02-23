package day42;

public class Movie {

    private String name;
    private double length;
    private String genre;


   // default constructor is given by compiler, only if you dont have nay in your class
    // its invvisible, and it has no parameter, it has no code inside


   /// default constructor will be only given... if you dont have one already
    //write a constructor to set all the field value

    public Movie(){

        System.out.println("Empty Movie");
    }

    public double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Movie(String name, double length, String genre) {
        this.name = name;
        this.length = length;
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }


}
