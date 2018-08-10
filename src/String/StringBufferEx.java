package String;

/**
 * Created by expert on 28/6/18.
 */
public class StringBufferEx {
    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("hello");
        StringBuffer sb1=new StringBuffer("hello");
        System.out.println(sb.append("world"));
        System.out.println(sb.insert(1,"hi"));
        System.out.println(sb.replace(1,5,"welcome"));
        System.out.println(sb.delete(1,3));
        System.out.println(sb.reverse());
        if(sb.equals(sb1)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
        String sb2=sb1.toString();
        sb2=sb2.concat("hi");
        System.out.println(sb2);

    }
}
