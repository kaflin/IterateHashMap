import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IterateHashMap {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Shruti");
        map.put(2,"Suraj");
        map.put(3,"Pranav");
        map.put(4,"Prashant");

//        System.out.println(map);


        //Traditional way of iterating HashMap
//        for(Map.Entry<Integer,String> entry:map.entrySet())
//        {
//            System.out.println("Key = "+entry.getKey());
//            System.out.println("Value = "+entry.getValue());
//        }


        //Iterating using java 8
        map.forEach((k,v)-> System.out.println("key ="+k+"Value ="+v));


    }
}
