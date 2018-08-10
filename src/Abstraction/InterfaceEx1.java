package Abstraction;

/**
 * Created by expert on 28/6/18.
 */
public class InterfaceEx1 implements InterfaceEx {


    @Override
    public void display() {
        System.out.println("hello");

    }

    @Override
    public int add(int x, int y) {

        return x+y;
    }

    public static void main(String[] args) {
        InterfaceEx obj=new InterfaceEx1();
        obj.display();
        System.out.println(obj.add(3,4));

    }
}
