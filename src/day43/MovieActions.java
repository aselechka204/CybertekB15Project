package day43;

import day42.Movie;

public class MovieActions {
    public static void main(String[] args) {

        Movie c= new Movie("Joker", 2.5, "drama");
        // int stores numbers its a container
        // scanner scan... its a container can store address of scanner object
        // movie m2=joker ... m2 is a container can store address of any movie object

        Movie c1= new Movie("Cinderella", 1.5, "Family");

        printMovieInformation(c);
        printMovieInformation(c1);
        printShortDurationMovieName(c,c1);

        Movie result= getJokerMovieObject();
        System.out.println("Name is "+result.getName());
    }

    public static Movie getJokerMovieObject(){
        Movie j = new Movie("Joker", 2.5, "drama");
        return j;
    }

    public static void printShortDurationMovieName(Movie movieObj1, Movie movieObj2){
        if(movieObj1.getLength() < movieObj2.getLength()){
            System.out.println(movieObj1.getName());
        }else{
            System.out.println(movieObj2);
        }

    }




    public static void printMovieInformation(Movie movieObj){

        System.out.println("the movie name "+ movieObj.getName());
        System.out.println("is "+movieObj.getLength()+ " hour long ");
        System.out.println(" and it genre is "+ movieObj.getGenre());
    }
}
