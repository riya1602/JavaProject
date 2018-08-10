package filesex;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Created by expert on 19/7/18.
 */
public class File1 {
    public static void main(String[] args)throws IOException {
        FileWriter f=new FileWriter("sample.txt");
        f.write("hello world.com");
        f.close();
        FileReader fin=new FileReader("sample.txt");
        int ch=0;
        while((ch=fin.read())!=-1){
            System.out.print((char)ch);
        }
        fin.close();

    }
}
