package collectionex;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by expert on 9/7/18.
 */
public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lmap=new LinkedHashMap<>();
        lmap.put("abc",1);
        lmap.put("xze",7);
        lmap.put("cde",4);
        lmap.put(null,null);
        lmap.put("jkl",null);
        for(Map.Entry<String,Integer> obj:lmap.entrySet()){
            System.out.println("key="+obj.getKey()+"  value="+obj.getValue());
        }
    }
}
