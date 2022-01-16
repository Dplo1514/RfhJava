package Collectionpkg;

import java.util.HashMap;
import java.util.Map;

public class Collection03 {
    public static void main(String[] args) {
        //Map :
        Map<Integer , String> myMap = new HashMap<>();
        myMap.put(0 , "Plo");
        myMap.put(1 , "Mild");
        myMap.put(2 , "Bust");
        myMap.put(3 , "Nasty");

        System.out.println("1st in map: " + myMap.get(0));
        myMap.remove(1);
        System.out.println(myMap);
        System.out.println(myMap.containsKey(1));
    }
}
