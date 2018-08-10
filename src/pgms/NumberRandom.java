package pgms;
import java.util.Random;
/**
 * Created by expert on 19/6/18.
 */
public class NumberRandom {
    public static void main(String[] args) {
        int n[]={5,10,15,20,4};
        Random r=new Random();
        for(int i=0;i<5;i++){
            System.out.println(n[r.nextInt(n.length)]);

        }
    }
}
