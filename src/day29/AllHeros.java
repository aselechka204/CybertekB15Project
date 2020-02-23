package day29;

public class AllHeros {
    public static void main(String[] args) {
        String[] allHeros={"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachHero : allHeros){
            System.out.println("Each Hero: "+eachHero);

            String hero1=eachHero;
            String stars="";
            for (int x = 0; x <eachHero.split("-")[1].length() ; x++) {
                stars+="*";

            }
            System.out.println("HIDDEN " + eachHero.split("-")[0]+stars);
        }
    }
}
