package filesex;

/**
 * Created by expert on 19/7/18.
 */import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Sample {
    public static void main(String[] args) throws IOException {
        FileReader fin=new FileReader("out.txt");
        FileWriter fout=new FileWriter("outnew.txt");
        int ch=0;
        while((ch=fin.read())!=-1){
            fout.write(ch);
        }

        fout.close();
        fin.close();
    }
}
