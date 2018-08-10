package polymorphism;

/**
 * Created by expert on 27/6/18.
 */
public class Area {
    public void findArea(float r){

        System.out.println("area="+3.14*r);
    }
    public void findArea(int x,int y){

        System.out.println("area1="+x*y);
    }
    public void findArea(float a,float b){

        System.out.println("area2="+a*b);
    }
    public static void main(String[] args) {
        Area obj=new Area();
        obj.findArea(3);

    }
}
