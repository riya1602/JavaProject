package collectionex;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by expert on 10/7/18.
 */
public class QueueEx {
    public static void main(String[] args) {
        //Queue<String> p=new PriorityQueue<>();
        ArrayDeque<String> p=new ArrayDeque<>();
        p.add("SNJU");
        p.add("anu");
        p.add("athi");
        p.addFirst("aami");
        p.addLast("sania");
        for(String i:p){
            System.out.println(i);
        }
        System.out.println("removed first element"+p.pollFirst());
        System.out.println("removed last element"+p.pollLast());
        System.out.println("first element="+p.element());//returns the head element
        System.out.println("first element="+p.peek());//returns the head element and returns null if queue is empty
        System.out.println("removed="+p.remove());//returns and removes  the first element
        System.out.println("removed="+p.poll());//returns and remove the first  element and returns null if queue is empty
        System.out.println("after removal");
        for(String i:p){
            System.out.print(i+" ");
        }
    }
}
