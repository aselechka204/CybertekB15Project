package day12;

public class WakeUpTask {
    public static void main(String[] args) {
        String weather = "rainy";

        if (weather.equals("sunny")){
            System.out.println("Code is Sunny Weather");
        } else if(weather.equals("rainy")) {
            System.out.println("Code is Rainy weather");
        } else if (weather.equals("cloudy")){
            System.out.println("Code in Cloudy weather");
        } else if (weather.equals("snowy")){
            System.out.println("Code in Snowy weather");
        } else {
            System.out.println("Rain or shine just keep coding anyway!!!");
        }
    }
}
