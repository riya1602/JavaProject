package inheritance;

/**
 * Created by expert on 27/6/18.
 */
public class Faculty extends Departmnet {
    int facid;
    String name;
    String number;
   public void display(){
        System.out.println("method in child class"+facid+"/"+name+"/"+number);
        System.out.println(super.deptid+"/"+super.deptname);
    }
     Faculty(int deptid,String deptname,int facid,String name,String number){
        //super();//invokes the constructor of parent class
        super(deptid,deptname);//invokes parametrized constructor of parent class
        this.facid=facid;
        this.name=name;
        this.number=number;
        System.out.println("constructor of child class");
    }

    public static void main(String[] args) {
        Faculty f=new Faculty(1,"ece",23,"anu","23333");
        f.display();
    }
}
