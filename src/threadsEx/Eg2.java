package threadsEx;

/**
 * Created by expert on 17/7/18.
 */
public class Eg2 implements Runnable {

    @Override
    public void run() {
       //System.out.println("thread in execution");
        for(int i=0;i<5;i++){
            System.out.println(i);
            //System.out.println(Thread.currentThread().getName());//to get the name of currently executing thread
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Eg2 obj=new Eg2();
        Thread t=new Thread(obj);
        t.start();
        Thread t1=new Thread(obj);
        try{
            t.join();
            System.out.println("executed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        Thread t2=new Thread(obj);
        t2.start();
        try{
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName());
        System.out.println(t1.getName());
        System.out.println("***");
    }
}
