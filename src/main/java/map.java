import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(0 , "plo");
        map.put(1 , "split");
        map.put(2 , "dail");
        map.put(3 , "bam");

        System.out.println(map);
        System.out.println("map 첫번째" + map.get(1));

        map.remove(0);
        System.out.println(map);
        System.out.println(map.containsKey(0));
        System.out.println(map.containsValue("split"));

        map.clear();
        System.out.println(map);
    }
}
