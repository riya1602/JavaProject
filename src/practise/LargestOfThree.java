package practise;
import java.util.*;
/**
 * Created by expert on 29/6/18.
 *///largest of three
public class LargestOfThree {
   static int a,b,c;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b&a>c){
            System.out.println(a);
        }
        else if(b>a&b>c){
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }



    }
}
