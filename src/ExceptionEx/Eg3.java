package ExceptionEx;

import java.io.IOException;

/**
 * Created by expert on 3/7/18.
 */
//compiletime EXception
public class Eg3 {
    public void first() throws IOException {
        second();
    }
    public void second() throws IOException {
        third();
    }
    public void third() throws IOException {
        throw new IOException("Exception");
    }

    public static void main(String[] args) {
        Eg2 e=new Eg2();
        try {
            e.first();

        }
        catch(Exception e1){

            e1.printStackTrace();
            //System.out.println(e1);
            System.out.println("exception propagated");
        }

    }

}