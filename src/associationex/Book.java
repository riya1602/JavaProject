package associationex;

/**
 * Created by expert on 11/7/18.
 */
public class Book {
    String name;
    int price;
    String id;
    Author obj;

    public Book(String name, int price, String id, Author obj) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.obj = obj;
    }
    public void display(){
        System.out.println(name+" "+price+" "+id+" "+obj.name+" "+obj.age+" "+obj.number);
    }
}
