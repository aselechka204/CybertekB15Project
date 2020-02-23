package day56;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.List;

public class Store {

    String name; // adding a field so we can give a name to store object when we create one
    List<Product> allProducts;  // store has list of products

    public Store(){

        this.name = "Cyber Store";
        this.allProducts= new ArrayList<>();

    }

    public Store(String name, List<Product> otherList) {
        this();
        this.name = name;

        allProducts.addAll(otherList);


    }
    public  void addProduct(Product p){
        System.out.println("calling addproduct product p ");
        allProducts.add(p);
    }
    public void addProduct(String productName, int productPrice ) {
        Product newP = new Product(productName, productPrice);
        allProducts.add(newP);

    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }

    public int getProductCount() {
        return allProducts.size();

    }
    /*
    display all products in human readable manner
     */
    public void displayProducts(){
        System.out.println( name+ "Store has bellow product");
        for( Product each : allProducts){
            System.out.println("\t each ="+each);
        }
    }

    public boolean checkIfProductExists(Product p){

        return allProducts.contains(p);
    }

    public int indexOfProduct(Product p) {
        return allProducts.indexOf(p) ;
    }
    public void removeProduct(Product p){
          if(checkIfProductExists(p)==true) {
              allProducts.remove(p);
          }else{
              System.out.println(" we dont have "+p);
          }
    }
}
