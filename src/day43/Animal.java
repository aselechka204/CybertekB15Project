package day43;

public class Animal {

    /*
    Pet
  attributes
		type
		name
  constructor :
  		no arg constructor
  			set the breed to "unknown"
  			set the name to "noname"
  		2 args constructor
  			set the name and breed to what the caller passed
 behaviours
 		getters , setters , toString
 		speak
 			accept no parameter
 			according to the type speak following
 				cat --> meow
 				dog --> woof
 				cow --> mooo
 				horse --> neinei
     */

   private String type;
    private String name;




    public Animal(String type) {
        this.type = "unknown";
        this.name= "no-name";
    }
    public Animal(String type, String name){
        this.type=type;
        this.name=name;
    }

    public Animal() {
        this.type = "unknown";
        this.name= "no-name";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void speak() {
        switch (type.toLowerCase()) {

            case "cat":
                System.out.println("MEOW");
                break;
            case "dog":
                System.out.println("WOOF");
                break;
            case "cow":
                System.out.println("MOO");
                break;
            case "horse":
                System.out.println("NEINEI");
                break;
            default:
                System.out.println("UNKNOWN Animal");
        }


    }

    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
