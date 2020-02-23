package day51;

// person IS A comparable
//yes because it implements comparable interface
//its a inheritance IS A Super Sub relationship
public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

 //   public int compareTo(Person otherPerson) {

//        if (this.age > otherPerson.age) {
  //          return 1;
 //       } else if (this.age < otherPerson.age) {
 //           return -1;
 //       } else {
 //           return 0;
//        }

//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    //now this becomes a natural order for comparing person object
   // @Override
  //  public int compareTo(Person otherPerson) {

  //             if (this.age > otherPerson.age) {
  //                 return 1;
  //                } else if (this.age < otherPerson.age) {
   //                  return -1;
   //               } else {
    //               return 0;
  //      }

 //   }

  //  @Override
   public int compareTo(Person otherPerson) {
//        if( this.name.charAt(1) > otherPerson.name.charAt(1)){
//               return 1;
//        }else if( this.name.charAt(1) < otherPerson.name.charAt(1)){
//            return -1;
//        }else{
//            return 0 ;
//        }

//}
       return this.name.compareTo(otherPerson.name);
   }
}