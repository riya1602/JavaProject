package Access_specifier;

/**
 * Created by expert on 29/6/18.
 */
public class Example {
    private int id;
    protected String name;
    protected void display(){

        System.out.println("hi");
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }
}
