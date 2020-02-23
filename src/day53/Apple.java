package day53;

public class Apple extends Fruit {

    String type;

    public Apple(String sweet, String taste, String color) {
        super(taste, color);
        this.type=type;
    }



    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void getDigest() {

    }

    @Override
    public void getDigested() {
        System.out.println(type+" apple is "+color+" color "+" and it has "+ taste+ " taste when you digest");

    }


}
