package Access_specifier;

/**
 * Created by expert on 29/6/18.
 */
public class Test  extends Example{
    public static void main(String[] args) {
        Test s=new Test();
        s.name="rgh";
        System.out.println(s.name);

        s.setId(1);
        System.out.println(s.getId());
        s.display();
    }

}
