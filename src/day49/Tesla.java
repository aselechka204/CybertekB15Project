package day49;

public class Tesla extends Vehicle implements Autonomous {


    int horsePower;
    String model;

    public Tesla(int horsePower, String model, int year){
        super(year);
        this.horsePower=horsePower;
        this.model=model;

    }


    @Override
    public void selfDrive() {
        System.out.println("SelfDrive");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
