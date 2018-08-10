package ExceptionEx;

/**
 * Created by expert on 2/7/18.
 */
//runtime exception Example
public class Eg1 {

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
            try {

                int y = 5 / 0;
                int[] a = {0, 1, 2, 3, 4, 5};
                System.out.println(a[7]);
            }
            catch (ArithmeticException e) {

                System.out.println("arithmetic exception caught");

            }

    }
        catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("null pointer exception caught");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("arrayindex bound exception caught");
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("next line");

    }
}
