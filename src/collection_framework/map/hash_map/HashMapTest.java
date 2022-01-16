package collection_framework.map.hash_map;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("김한울", 18);
        map.put("기마눌", 19);
        map.put("기마늘", 20);
        map.put("김마늘", 21);
        System.out.println("entry size: " + map.size());

        System.out.println("\t기마눌: " + map.get("기마눌"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        map.remove("기마눌");
        System.out.println("entry size: " + map.size());

        Set< Map.Entry<String, Integer> > entrySet = map.entrySet();
        Iterator< Map.Entry<String, Integer> > entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        map.clear();
        System.out.println("entry size: " + map.size());

    }
}
