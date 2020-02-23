package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        String[] shows= {"Orville","Gifted","Game of Thone","Flash","Arrow","Super girl"};
        int showsCount=shows.length;
        System.out.println("shows count = "+showsCount);

        for (int x = 0; x <showsCount ; x++) {
            String currentShow=shows[x];
            System.out.println(currentShow+" has character count "+currentShow.length());

      //      String myFavoriteShow=shows[0];
      //      System.out.println("myfavoriteshow= "+ myFavoriteShow+"char count "+myFavoriteShow.length());

            System.out.println(shows[x]+" has character count :"+ shows[x].length());

}
    }
}
