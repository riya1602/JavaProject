package inheritance;

/**
 * Created by expert on 27/6/18.
 */
public class Departmnet {
    int deptid;
    String deptname;
    public Departmnet(int deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public void display(){

        System.out.println("parent class method");
    }
}
