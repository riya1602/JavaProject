package Abstraction;

/**
 * Created by expert on 4/7/18.
 */
public class Eg11 {
    public static void main(String[] args) {
        InterfaceEx2 obj=new InterfaceEx2() {
            @Override
            public void display() {
                System.out.println("hello");

            }


            @Override
            public int add(int x, int y) {
                return x+y;
            }
        };
        obj.display();
        System.out.println(obj.add(3,4));
    }
}
