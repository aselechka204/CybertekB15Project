package day24;

public class WarmUp {
    public static void main(String[] args) {



        String[] groceryItems={"apples", "banana", "grape", "strawberry", "blueberry", "kiwi" };
        double[] storePrices={1.99 , 0.99, 4.65, 3.89, 3.88, 2.88};
        //String[] groceryItems=new String[6];
        //String[] groceryItems=new String[]{"apples", "banana", "grape", "strawberry", "blueberry", "kiwi" };


        int itemCount=groceryItems.length;
      int lastItem=itemCount-1;
      String lastFruit=groceryItems[lastItem];
        for(String  eachfruit:groceryItems    ) {
            System.out.print(eachfruit);
            if (!eachfruit.equalsIgnoreCase(lastFruit)) {
                System.out.print("--->");

            }
        }

    }
}
