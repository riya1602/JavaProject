package Constructorex;

/**
 * Created by expert on 27/6/18.
 */
public class Abc {
   static int i;
   static String name;
   static float f;
    double k;

    public Abc(int l, String s, float m, double n) {
        i = l;
        name = s;
        f = m;
        k = n;
    }
    public void abc(){
    System.out.println("method with same name of constructor");
}
    public static void main(String[] args) {
        Abc obj=new Abc(1,"anu",4.05f,6.5d);
        System.out.println(i+name+f+obj.k);
        obj.abc();

    }
}
