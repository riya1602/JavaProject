package collectionex;

/**
 * Created by expert on 12/6/18.
 */import java.util.ArrayList;
public class BookM {
    int id;
    String name;
    String author;
    int price;
    BookM(int id,String name,String author,int price){
        this.id=id;
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public static void main(String[] args) {
        BookM b1=new BookM(1,"wer","rtd",175);
        BookM b2=new BookM(2,"ghy","thy",987);
        ArrayList<BookM> bl=new ArrayList<BookM>();
        bl.add(b1);
        bl.add(b2);
        for(BookM i:bl){
            System.out.println("id="+i.id+" "+"name="+i.name+" "+"author="+i.author+" "+"price="+i.price);
        }
    }
}
