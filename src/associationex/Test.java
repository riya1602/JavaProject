package associationex;

/**
 * Created by expert on 11/7/18.
 */
public class Test {
    public static void main(String[] args) {
        Author a=new Author("jkl","45",98765);
        Book b=new Book("abc",230,"12",a);
        b.display();
    }
}
