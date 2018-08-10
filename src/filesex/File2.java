package filesex;

/**
 * Created by expert on 19/7/18.
 */import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) throws IOException {
        File f = new File("firspro", "input");
        System.out.println(f.exists());
        f.mkdirs();

        f.exists();
        File f1=new File("Ex4","file1.txt");
        f1.getParentFile().mkdirs();
        f1.createNewFile();
        //f1.delete();
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
    }
}
