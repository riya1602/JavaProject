package Array_of_objects;

/**
 * Created by expert on 26/6/18.
 */
public class Product {
    int productid;
    String prodname;
    float price;
    Product(){
    }
    public Product(int productid, String prodname, float price) {
        this.productid = productid;
        this.prodname = prodname;
        this.price = price;
    }
    public  static void getDisplay(Product parry[]){
        System.out.println("  price less than 100:");
        for(Product j:parry) {
            if (j.price < 100) {
                System.out.println(j.productid+" "+j. prodname +" "+ j.price);
            }
        }
    }

    public static void main(String[] args) {
        Product obj=new Product(1,"rice",200.78f);
        Product obj1=new Product(2,"wheat",90.50f);
        Product obj2=new Product(3,"pen",10);
       Product parry[]={obj,obj1,obj2};//array of objects
       for(Product i:parry){
           System.out.println(i.productid+" "+i.prodname+" "+i.price);
       }
       getDisplay(parry);

    }
}
