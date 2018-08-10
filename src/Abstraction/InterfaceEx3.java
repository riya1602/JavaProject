package Abstraction;

import Array_of_objects.Product;

/**
 * Created by expert on 29/6/18.
 */
public class InterfaceEx3{
    public static void main(String[] args) {
Eg1 f=new Eg1() {
    @Override
    int add(int x, int y) {
        return x+y;
    }

    @Override
    void display() {

    }
};
       f.display();
        Eg1.show();

        System.out.println( f.add(2,3));

    }
}
