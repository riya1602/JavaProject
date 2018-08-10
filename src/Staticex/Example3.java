package Staticex;

/**
 * Created by expert on 22/6/18.
 */
public class Example3 {
    static int i;
    static class StaticExample{
        // i=10;
        static void disp(){

            System.out.println("static method");
        }
        public void getfun()
        {
            System.out.println("non static method");
        }
    }

    public static void main(String[] args) {
        Example3.StaticExample.disp();
        Example3.StaticExample obj=new Example3.StaticExample();
        obj.getfun();

    }
}
