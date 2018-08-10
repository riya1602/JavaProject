import java.util.ArrayList;

/**
 * Created by expert on 8/8/18.
 */
public class LambdaEx {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("anu");
        al.add("athi");

        al.forEach(
                (n)-> System.out.println(n)

        );
    }
}
