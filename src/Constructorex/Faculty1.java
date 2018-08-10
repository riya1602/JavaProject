package Constructorex;

/**
 * Created by expert on 21/6/18.
 */
public class Faculty1 {

        static int id;
        static String name;
        static String dept;
        static int salary;
        Faculty1(int id, String name, String dept, int salary){
            this.id=id;
            this.name=name;
            this.dept=dept;
            this.salary=salary;
        }
        public  static void display(int id, String name, String dept, int salary){
            System.out.println(id+"/"+name+"/"+dept+"/"+salary);


        }

        public static void main(String[] args) {

            display(23,"riya","ece",23000);
        }

    }


