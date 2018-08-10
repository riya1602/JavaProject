package inheritance;

/**
 * Created by expert on 29/6/18.
 */
public class Child2 extends Child1 {
    Child2(){
        super();
        System.out.println("child2 class");
    }

    public static void main(String[] args) {
        Child2 obj=new Child2();
        Child1 obj1=new Child1();
    }
}
