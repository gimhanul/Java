package collection_framework.set.method_overriding;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("김한울", 18));
        set.add(new Member("김한울", 18));

        System.out.println("size: " + set.size());
    }
}
