package String;
import java.util.StringTokenizer;
/**
 * Created by expert on 26/6/18.
 */
public class Eg4 {
    public static void main(String[] args)
    {

        StringTokenizer obj = new StringTokenizer("hi hello,how,r,u", ",");
        while (obj.hasMoreTokens())
        {
            System.out.println(obj.nextToken());
        }
    }

}
