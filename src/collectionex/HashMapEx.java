package collectionex;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expert on 9/7/18.
 */
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap<>();
        h.put("1",1);
        h.put("2",2);
        for(Map.Entry<String,Integer> obj:h.entrySet()){
            System.out.println(obj.getKey()+" "+obj.getValue());
        }
    }
}
