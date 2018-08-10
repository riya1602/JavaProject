package Constructorex;

/**
 * Created by expert on 21/6/18.
 */
public class Faculty {
    int id;
    String name;
    String dept;
    int salary;
    Faculty(int id,String name,String dept,int salary){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        System.out.println("hi");
    }
    public void display(){
        System.out.println(id+" "+name+" "+dept+" "+salary);


    }

    public static void main(String[] args) {
        Faculty f=new Faculty(23,"anu","ece",23000);
        f.display();
    }

}
