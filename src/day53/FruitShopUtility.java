package day53;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);
         displayFruit(f1);
         displayFruit(f2);
         displayFruit((new Apple("tasteeless", "red", "Golden")));

        System.out.println("-----------------");
        digestBetter(f2);
        digestBetter(new Orange("sweet", "tellowish", 1 ));
    }

    private static void digestBetter(Fruit f2) {

    }

    // displayFruit
    public static void displayFruit(Fruit anyFruit) {

        System.out.println("Displaying fruit \n" + anyFruit.toString());


        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();

        System.out.println("any fruit"+anyFruit);

    }

}


