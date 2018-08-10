package threadsEx;

/**
 * Created by expert on 18/7/18.
 */
public class Thread1Ex {
    synchronized static void display(int x){


          // synchronized (this){
               for(int i=0;i<5;i++){
                   System.out.println(i*x);
                   try {
                       Thread.sleep(500);
                       //this.wait(1000);
                       System.out.println(Thread.currentThread().getName());
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }

        }
    }



