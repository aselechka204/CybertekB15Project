package day18;

public class OfficeHour {
    public static void main(String[] args) {
        String letters = "J%a/V**$1a";
        // remove symbols
        letters=letters.replace("%","")
                     .replace("/","")
                      .replace("**","")
                      .replace("$1","");
        System.out.println("letters="+letters);
    }
}
