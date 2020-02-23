package day43;

import org.w3c.dom.ls.LSOutput;

public class Coffee {

    private String type;
    private int caffeinelevel;
    private double price;

    public Coffee(){
        System.out.println("no arg constructor");
    }

    public Coffee(String type, int caffeinelevel ){
         this.type= type;
         this.caffeinelevel=caffeinelevel;
        System.out.println("2 args constructor");
    }
    public Coffee(String type, int caffeinelevel, double price ) {
        this.type= type;
        this.caffeinelevel=caffeinelevel;
        if(price<=0){
            this.price=1;
        }else{
            this.price=price;
        }


    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeinelevel() {
        return caffeinelevel;
    }

    public void setCaffeinelevel(int caffeinelevel) {
        this.caffeinelevel = caffeinelevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeinelevel=" + caffeinelevel +
                ", price=" + price +
                '}';
    }
}
