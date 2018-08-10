package ExceptionEx;

/**
 * Created by expert on 2/7/18.
 */
public class Eg2 {
    public void first(){
        second();
    }
    public void second(){
        third();
    }
    public void third(){
        throw new ArithmeticException("exception");
    }

    public static void main(String[] args) {
        Eg2 e=new Eg2();
        try {
            e.first();

        }
        catch(Exception e1){

            e1.printStackTrace();
            System.out.println(e1);
            System.out.println("exception propagated");
        }

    }
}
