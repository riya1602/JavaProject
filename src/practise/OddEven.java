package practise;
import java.util.*;
/**
 * Created by expert on 29/6/18.
 *///odd even without using %
public class OddEven {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int r=(a/2)*2;
      if(a==r){
          System.out.println("even");
      }
      else {
          System.out.println("odd");
      }
    }
}
