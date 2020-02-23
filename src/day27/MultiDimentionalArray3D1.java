package day27;

public class MultiDimentionalArray3D1 {
    public static void main(String[] args) {
        int[][] numbers={{12, 11, 10, 19}, {19, 20, 15},{100, 90, 89, 7888},{900, 700, 600, 500}};

        String[] developersTeam={"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam={"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalystTeam={"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam={developersTeam, testerTeam, businessAnalystTeam};
        int maxLength=scrumTeam[0][0].length();
        String longestString="";

        for (String[] each1DArray  : scrumTeam) {
            for (String eachElement:each1DArray) {
                if(maxLength<eachElement.length()){
                    maxLength=eachElement.length();
                    longestString=eachElement;
                }

            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);
        for (String[] each1DArray  : scrumTeam) {
            for (String eachElement:each1DArray){
                if(maxLength==eachElement.length()) {
                    System.out.println(eachElement);
                }
                }

                }

        int minLength= scrumTeam[0][0].length();
        String shortestString=scrumTeam[0][0];
        for (int i = 0; i <scrumTeam.length ; i++) {
            for (int j = 0; j <scrumTeam[i].length ; j++) {
                if(minLength> scrumTeam[i][j].length()){
                    minLength=scrumTeam[i][j].length();
                    shortestString=scrumTeam[i][j];

                }

            }

        }
        System.out.println(minLength);
        System.out.println(shortestString);

    }
}
