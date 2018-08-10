package Access_specifier2;
import Access_specifier.Example;
/**
 * Created by expert on 29/6/18.
 */
public class Test extends Example {
    public static void main(String[] args) {


        Example s = new Example();
        //s.name = "rgh";
        //s.id-cannot be accessed
        s.setId(1);
        System.out.println(s.getId());
        //s.display();
        Test t=new Test();
        t.display();
        t.name="riya mary";
        System.out.println(t.name);

    }
}
