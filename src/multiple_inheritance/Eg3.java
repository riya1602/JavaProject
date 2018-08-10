package multiple_inheritance;

/**
 * Created by expert on 1/7/18.
 */
public class Eg3 implements Eg1,Eg2 {
    public void m1(){
        System.out.println(Eg1.i);
        System.out.println(Eg2.i);
    }

    public static void main(String[] args) {
        Eg3 obj=new Eg3();
        obj.m1();
    }
}
