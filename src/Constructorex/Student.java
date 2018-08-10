package Constructorex;

/**
 * Created by expert on 21/6/18.
 */
public class Student {
    String name;
    int roll_no;

    Student(){

    }
    Student(int Roll_no,String Name){
        this.roll_no=Roll_no;
        this.name=Name;
    }

    public static void main(String[] args) {
        Student s=new Student();//object for default constructor
        System.out.println(s.roll_no+" "+s.name);
        Student s1=new Student(23,"gh");//object for parametrised constructor
        System.out.println(s1.roll_no+" "+s1.name);

    }
}
