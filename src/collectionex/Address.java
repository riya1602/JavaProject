package collectionex;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by expert on 9/7/18.
 */
public class Address {
    String name;
    String address;
    int age,no;

    public Address(String name, String address,int age,int no) {
        this.name = name;
        this.address = address;
        this.age=age;
        this.no=no;
    }
    public static void search(TreeMap<String,Address>pm,String hno){
        for(Map.Entry<String,Address> obj:pm.entrySet()) {
            if (obj.getKey().equals(hno)) {
                Address s=obj.getValue();
                System.out.println(obj.getKey()+" "+s.name+" "+s.address+" "+s.age+" "+s.no);
            }

        }
    }
    public static void removefn(TreeMap<String,Address>pm,String hno){
        for(Map.Entry<String,Address> obj:pm.entrySet()) {
            if (obj.getKey().equals(hno)) {
                pm.remove(obj.getKey());
                System.out.println("removed");
                break;
        }
    }
    }
    public static void updatefn(TreeMap<String,Address>pm,String hno,String name){
        for(Map.Entry<String,Address> obj:pm.entrySet()) {
            if (obj.getKey().equals(hno)) {
                Address s = obj.getValue();
                s.name = name;
                System.out.println("name updated to" + name);

                    Address s1 = obj.getValue();
                    System.out.println(obj.getKey() + " " + s1.name + " " + s1.address + " " + s1.age + " " + s.no);

            }
        }
    }
    public static void main(String[] args) {
        Address obj=new Address("sree","abc",23,9876);
        Address obj1=new Address("rmk","dfg",45,9887);
        TreeMap<String,Address>pm=new TreeMap<String,Address>();
        pm.put("1",obj);
        pm.put("2",obj1);
//        for(Map.Entry<String,Address> obj2:pm.entrySet()){
//           Address s=obj2.getValue();
//            System.out.println(obj2.getKey()+" "+s.name+" "+s.address+" "+s.age+" "+s.no);
//        }
       search(pm,"2");
        updatefn(pm,"1","riya");
        removefn(pm,"2");
    }
}
