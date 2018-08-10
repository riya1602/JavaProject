package Abstraction;

/**
 * Created by expert on 28/6/18.
 */
public class Eg2 extends Eg1 {

    @Override
    int add(int x,int y) {

        return x+y;
    }

    @Override
    void display() {

        System.out.println("abstract class function");
    }

    public static void main(String[] args) {
    Eg2 obj=new Eg2();
    System.out.println(obj.add(2,3));
    obj.display();
    show();
    Eg1 obj1=new Eg2();
    System.out.println(obj1.add(4,5));
    obj1.display();
    show();

    }
}
