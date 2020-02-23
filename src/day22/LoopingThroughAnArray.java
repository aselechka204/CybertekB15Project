package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {
        int [] scores = new int [4];
        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);

        System.out.println(scores[2]);
        System.out.println(scores[3]);
        // array object has a property called length

        int itemCount= scores.length;
        int lastCount=itemCount-1;
       // String name = "Jon Snow";
      //  int charCount=name.length();
        for (int i = 0; i <itemCount ; i++) {
            System.out.println(scores[i]);
            for (int x = lastCount; x >=0; x--) {
                System.out.println(scores[x]);

            }



        }
    }
}
