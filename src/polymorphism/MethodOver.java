package polymorphism;

/**
 * Created by expert on 13/6/18.
 */
public class MethodOver {
    public static void sum(int a,int b){

        System.out.println(a+b);
    }
    public static void sum(int a,float b)
    {

        System.out.println(a+b);
    }
    public static void sum(float a,int b){

        System.out.println(a+b);
    }
    public static void sum(Integer a,Integer b){

        System.out.println(a+b);
    }

    public static void main(String[] args) {

        sum(new Integer(20), new Integer(10));
        sum(10,20);
        sum(10.03f,1);
    }
}
