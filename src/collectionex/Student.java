package collectionex;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expert on 10/7/18.
 */
public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student obj=new Student(1,"anu");
        Student obj1=new Student(2,"athi");
        HashMap<String,Student> al=new HashMap<>();
        al.put("1",obj);
        al.put("2",obj1);
        for(Map.Entry<String,Student> obj2:al.entrySet()){
            Student i=obj2.getValue();
            System.out.println(obj2.getKey()+" "+i.id+" "+i.name);
        }
    }
}
