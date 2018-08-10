package String;

/**
 * Created by expert on 22/6/18.
 */
public class Eg1 {
    public static void main(String[] args) {

        String j="ABC";
        String s="abc";
        String s1="abc";
        String s2="DEF";
        String s3="hi hello";
        j=j.concat("def");
       System.out.println(j);
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s3.substring(0,3));
        System.out.println(s3.substring(3));

    }
}
