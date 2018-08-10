package collectionex;

import java.util.ArrayList;

/**
 * Created by expert on 4/7/18.
 */
public class Parking {
    int type;
    int time;
    String id;
    Parking(int type,int time,String id){
        this.type=type;
        this.time=time;
        this.id=id;
    }
    static void add(Parking p,ArrayList<Parking> parkname) {
        if (parkname.size() < 3) {
            parkname.add(p);
            System.out.println("added");
        }
        else {
            System.out.println("slot filled");
        }
    }
    static  void remove(ArrayList<Parking> parkname,String id){
        for(Parking p:parkname) {
            if (p.id.equals(id)) {
                parkname.remove(p);
                System.out.println("removed vehicle id" + id);
                if (p.type == 2) {
                    System.out.println("amount" + p.time * 50);
                }
                    else {
                    System.out.println("amount is" + p.time * 100);

                        }
                    break;
            }
        }

    }
    public static void main(String[] args) {
        Parking p =new Parking(2,5,"101");
        Parking p1=new Parking(2,4,"102");
        Parking p2=new Parking(2,6,"103");
        Parking p3=new Parking(2,6,"104");
        Parking p11=new Parking(4,4,"401");
        Parking p12=new Parking(4,5,"402");
        Parking p13=new Parking(4,6,"403");
        Parking p14=new Parking(4,7,"404");
        Parking p15=new Parking(4,8,"405");
        ArrayList<Parking> park2=new ArrayList<Parking>();
        ArrayList<Parking> park4=new ArrayList<Parking>();
        add(p,park2);
        add(p1,park2);
        add(p2,park2);
        add(p3,park2);
        add(p11,park4);
        add(p12,park4);
        add(p13,park4);
        add(p14,park4);
        add(p15,park4);
        remove(park2,"102");
        remove(park4,"403");
        add(p14,park4);
        add(p15,park4);

    }
}

