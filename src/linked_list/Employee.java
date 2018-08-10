package linked_list;

import java.util.LinkedList;

/**
 * Created by expert on 5/7/18.
 */
public class Employee {
    String name;
    float salary;
    String dept;

    public Employee(String name, float salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public static void add(LinkedList <Employee> al,Employee e){

            al.add(e);


    }
    public static void display(LinkedList <Employee> al){

        for(Employee i:al){
            System.out.println(i.name+" "+i.salary+" "+i.dept);
        }
    }

    public static void main(String[] args) {
        LinkedList <Employee> al=new LinkedList<Employee>();
        Employee obj=new Employee("anu",45000,"ece");
        Employee obj1=new Employee("anju",34000,"eee");
        add(al,obj);
        add(al,obj1);
        display(al);

    }
}
