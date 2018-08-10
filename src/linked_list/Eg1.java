package linked_list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by expert on 5/7/18.
 */
public class Eg1 {
    public static void main(String[] args) {
       LinkedList<String> al=new LinkedList<String>();//generic declaration
        LinkedList al1=new LinkedList();//non generic declaration
        al.add("sss");
        al.add("sss");
        al.add(null);
        al.addFirst("kil");
        al.addLast("jhy");
        al.addFirst("rmj");
        al1.add(1);
        al1.add("ghj") ;
       al.removeFirst();
        al.removeLast();
        for (String x:al) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println("\n");
        for(Object i: al1){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
            System.out.print(" ");
        }

    }
}
