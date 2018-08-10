package threadsEx;

/**
 * Created by expert on 17/7/18.
 */
// thread creating by extending thread class
public class Eg1 extends  Thread{
    public void run(){

        System.out.println("thread in execution");
    }


    public static void main(String[] args) {
        Eg1 t=new Eg1();
        t.start();
        System.out.println("");

    }

}
