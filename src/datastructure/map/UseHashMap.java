package datastructure.map;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {

    /*
     *
     * Map is created and inserted some data
     * 1. retrieve and print out the Collection view (map entries) of values present in map
     * 2. print out Denver
     *
     */

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        System.out.println(map);
        for (Integer i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }

        for (Integer i : map.keySet()) {
            if (map.get(i).equalsIgnoreCase("Denver")){
            System.out.println(map.get(i));
            }
        }
        //write your code here

    }
}
