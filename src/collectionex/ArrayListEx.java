package collectionex;

/**
 * Created by expert on 12/6/18.
 */import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList <String>al=new ArrayList<String>();
        al.add("abhi");
        al.add("raj");
        al.add("anju");
//        for(String i:al){
//            System.out.print(i+" ");
//        }
//        System.out.println("\n");
//        System.out.println("using while loop");
//        Iterator itr=al.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }
//        System.out.println("\n");
//        System.out.println("using for loop");
//        for(int i=0;i<al.size();i++){
//            System.out.print(al.get(i)+" ");
//        }
        ArrayList <String> al1=new ArrayList<String>();
        al1.add("abc");
        al1.add("def");
        al1.add("anju");
        ArrayList <String> al2=new ArrayList<String>();
        al2.add("hi");
        al2.add("hello");
        al2.add("world");

        System.out.println("\n");
       // System.out.println(al.get(2));
        al.addAll(al1);
        for(String i:al){
            System.out.print(i+" ");
        }
       // al.addAll(al2);
        al1.retainAll(al);
        //al.removeAll(al2);
        System.out.println("\n");

        for(String i:al1){
            System.out.print(i+" ");
        }


    }
}
