package String;

/**
 * Created by expert on 25/6/18.
 */
public class Eg2 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("hii");

        s.append("hello");

        System.out.println(s);
        StringBuilder s1=new StringBuilder("hello world");
        System.out.println(s1);
        String s3=s.toString();
        System.out.println(s3);
        s3.concat("world");
        System.out.println(s3);

    }
}
