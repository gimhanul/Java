package basic_api_class.object.hash_code;

import java.util.HashMap;

public class KeyTest {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        hashMap.put(new Key(1), "김한울");

        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }
}
