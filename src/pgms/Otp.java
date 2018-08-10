package pgms;
import java.util.Random;
/**
 * Created by expert on 19/6/18.
 */
public class Otp {
    public static void main(String[] args) {
        String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str2="abcdefghijklmnopqrstuvwxyz";
        String str3="0123456789";
        String str4=str1+str2+str3;
        int len=8;
        Random r=new Random();
        char[] password=new char[len];

        for(int i=0;i<len;i++){
            password[i]=str4.charAt(r.nextInt(str4.length()));
            System.out.print(password[i]);
        }


    }


}
