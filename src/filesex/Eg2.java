package filesex;

/**
 * Created by expert on 21/7/18.
 */import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
public class Eg2 {
    //static String line = "";

    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String s = obj.readLine();
        System.out.println(s);
    }
}