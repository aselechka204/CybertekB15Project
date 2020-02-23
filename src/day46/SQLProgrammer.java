package day46;

public class SQLProgrammer extends Programmer {


    @Override
   protected void code() {

        System.out.println("writting sql query");
        //
    }

    @Override
   public void test() {
        System.out.println("Test sql query");
       // super.test();
    }

    public void writeSQLQuery(){
        System.out.println("writing sql query!");
    }
}
