package collectionex;

/**
 * Created by expert on 19/7/18.
 */import java.util.regex.*;
public class RegexEx {
    public static void main(String[] args) {
        boolean b=Pattern.matches(".s","as");//last character should be s
        System.out.println(Pattern.matches("..s","ass"));
        System.out.println(b);
        System.out.println(Pattern.matches("[abc]","a"));//a or b or c
        System.out.println(Pattern.matches("[abc]*","abc"));
        System.out.println(Pattern.matches("[a-z]{2}","ab"));//size is given in curly brace.
        // so it will compare upto 2 characters
        System.out.println(Pattern.matches("[a-d[m-p]]{3}","adm"));//[a-dm-p]
        System.out.println(Pattern.matches("\\w","9"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","aa10K"));
        System.out.println(Pattern.matches("[789]{1}[\\d]{9}","9846408877"));
        System.out.println(Pattern.matches("[@#$]","@"));
        System.out.println(Pattern.matches("[\\da-z@#%$^]*[@][a-z]{5}[.com]{4}","riyamary16@gmail.com"));
        System.out.println(Pattern.matches("[\\d]*[/][\\d]*[/][\\d]*","1/5/1995"));





    }
}
