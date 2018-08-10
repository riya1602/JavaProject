package filesex;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expert on 21/7/18.
 */
public class FileReplace {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("example.txt");
        f.write("welcome to hello world");
        f.close();
        int ch = 0;
        String s;
        //String s1;
        FileReader fin = new FileReader("example.txt");
        while ((ch = fin.read()) != -1) {
            //System.out.print((char)ch);
            char ab = (char) ch;
            //System.out.print(ab);
            s = Character.toString(ab);

        }
    }
}
