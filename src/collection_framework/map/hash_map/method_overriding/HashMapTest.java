package collection_framework.map.hash_map.method_overriding;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1206, "김한울"), 1);
        map.put(new Student(1206, "김한울"), 1);

        System.out.println("entry size: " + map.size());
    }
}
