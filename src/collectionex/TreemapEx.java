package collectionex;

/**
 * Created by expert on 9/7/18.
 */import java.util.TreeMap;
import java.util.Map;
public class TreemapEx {
    public static void main(String[] args) {
        Map <String,String> lmap=new TreeMap<>();
        lmap.put("ghe","1");
        lmap.put("jke","4");
        lmap.put("ere",null);
        lmap.put("jlk","2");
        for(Map.Entry<String,String> obj:lmap.entrySet()){
            System.out.println("key="+obj.getKey()+"  value="+obj.getValue());
        }

    }
}
