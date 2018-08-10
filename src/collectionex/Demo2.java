package collectionex;

import java.util.ArrayList;
/**
 * Created by expert on 12/6/18.
 */
public class
Demo2 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<String> a = new ArrayList<String>();
        a.add(null);
        a.add("anju");
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        a.remove(null);
        System.out.println(a.get(0));
        for(String j:a){
            System.out.println(j);
        }
        for (int i=0;i<al.size();i++) {
            System.out.println(al.get(i));
        }
    }
}
