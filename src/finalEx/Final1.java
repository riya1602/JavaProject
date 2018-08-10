package finalEx;

/**
 * Created by expert on 4/7/18.
 */
public class Final1 {
    //final int i=10;
    static  int i=10;
    Final1(){
        i=i+10;
    }

    public static void main(String[] args) {
        Final1 obj=new Final1();
        System.out.println(i);
    }
}
