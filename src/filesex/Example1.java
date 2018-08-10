package filesex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by expert on 11/7/18.
 */
public class Example1 {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream f=new FileOutputStream("out.txt");
        String s="hello world";
        byte[] b=s.getBytes();
        f.write(b);
        f.close();*/
      //  f.write(10001);
        FileInputStream f1=new FileInputStream("out.txt");
        int i=0;
        while((i=f1.read())!=-1) {

            System.out.print((char) i);
        }
        f1.close();

    }
}
