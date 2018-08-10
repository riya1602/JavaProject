package threadsEx;

/**
 * Created by expert on 17/7/18.
 */
class Thread1 extends Thread{
    Thread1Ex obj;
    Thread1(Thread1Ex obj){

        this.obj=obj;
    }
   ;
    public void run(){

        obj.display(100);
    }



}
class  Thread2 extends Thread{
    Thread1Ex obj;
    Thread2(Thread1Ex obj){

        this.obj=obj;
    }

    public void run(){

        obj.display(5);
    }

}

public class Eg4 {

    public static void main(String[] args) {
        Thread1Ex obj=new Thread1Ex();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
//        Thread1Ex obj1=new Thread1Ex();
//        Thread1 t3=new Thread1(obj1);
//        Thread2 t4=new Thread2(obj1);
//        t3.start();
//        t4.start();

    }
}
