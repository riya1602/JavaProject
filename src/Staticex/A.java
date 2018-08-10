package Staticex;

/**
 * Created by expert on 21/6/18.
 */
public class A {
    static int a=1;
    int j=1;

    A(){
      ++a;
      ++j;
      System.out.println("constuctor");
    }
    static{
        int i=11;
        System.out.println(i);
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println(a);
        A obj=new A();
        System.out.println(a);
        System.out.println(obj.j);

        A obj1=new A ();
       System.out.println(a);
        System.out.println(obj1.j);
    }
}
