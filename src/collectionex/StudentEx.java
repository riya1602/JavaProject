package collectionex;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by expert on 3/7/18.
 */
public class StudentEx {
    int id;
    int age;
    String name;
    StudentEx(int id,int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        ArrayList<StudentEx> s=new ArrayList<StudentEx>();
        StudentEx obj=new StudentEx(1,23,"anu");
        StudentEx obj1=new StudentEx(2,24,"athi");
        s.add(obj);
        s.add(obj1);
       // s.remove(obj1);
        for(StudentEx i:s){
            System.out.println(i.id+" "+i.age+" "+i.name);
        }
        Iterator i=s.iterator();
        while(i.hasNext()){
            StudentEx obj2=(StudentEx)i.next();
            System.out.println(obj2.id+" "+obj2.age+" "+obj2.name);
        }

    }




}
