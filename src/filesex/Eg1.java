package filesex;

/**
 * Created by expert on 19/7/18.
 */import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;

public class Eg1 {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("example.txt");
        f.write("welcome to hello world ");
        f.close();
        int ch=0;
        FileReader fin=new FileReader("example.txt");
        String sb = new String();
        String se=new String();

        ArrayList<String>al=new ArrayList<>();
        char a=' ';
        while ((ch = fin.read()) != -1) {
            if((char)ch!=' '){
                a=((char)ch);
                sb=sb.concat(Character.toString(a));

            }
            if((char)ch==(' ')){
                al.add(sb);
                sb=se;
            }

        }
        System.out.println(al);
        fin.close();
    }
}
