package day41;

public class Product {

    private String name;
    private double price;


    //          "this.name"   , "this.price",
 // this keyword can be used to refer the current object
    // we are working on
    // we can use it for refer the instence field
    //this.fieldName
    //only can be used inside instance method and later constructor
    public String getName(){
        return this.name;
        // return name

    }


    public void setName(String name){
      //  name=newName;

        this.name= name;

    }


    public double getPrice(){

        return price;

    }
    public void setPrice(double price){
        if(price>0){
       this.price=price;
}
    }


}
