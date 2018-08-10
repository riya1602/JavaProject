package filesex;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by expert on 11/7/18.
 */
public class Exampl2 {
    public static void main(String[] args) throws IOException{
        /*BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        String s=obj.readLine();
        System.out.println(" "+s);*/
        File f=new File("in.txt");
        if(!(f.exists()))
            f.createNewFile();

    }
}
