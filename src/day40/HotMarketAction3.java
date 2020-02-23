package day40;

public class HotMarketAction3 {
    public static void main(String[] args) {
        Offer1Part o1 = new Offer1Part();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = false;
        o1.salary = 140000;


        o1.displayInformation();
        o1.turnToFullTime();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displayInformation();

        o1.changeAllInfo("Amazon", "Virginia", 150000, true);

        boolean result = o1.is100KOffer();
        System.out.println("is it 100k offer?" + o1.is100KOffer());
        if (result == true) {
            o1.changeLocation("Atlanta");
        }
        o1.displayInformation();

    }


    }

