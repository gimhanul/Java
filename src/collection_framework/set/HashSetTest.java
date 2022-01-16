package collection_framework.set;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("JAVA");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("JAVA");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("size: " + size);
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("size: " + set.size());

        iterator = set.iterator();
        for(String element : set) {
            System.out.println("\t" + element);
        }

        set.clear();
        if(set.isEmpty()) System.out.println("빔");
    }
}
