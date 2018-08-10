package threadsEx;

/**
 * Created by expert on 18/7/18.
 */
public class Garbage1 {
    protected void finalize() throws Throwable {
        System.out.println("garbage collection");
    }


        public static void main (String[] args){
            Garbage1 obj = new Garbage1();
            //obj = null;//manually clearing memory after use
            //Garbage1 obj1=obj;//changing referance
            Garbage1 obj2=new Garbage1();
            obj=null;//nulling the referance
            obj2=null;
            System.gc();

        }

}