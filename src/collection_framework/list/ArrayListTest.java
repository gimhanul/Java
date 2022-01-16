package collection_framework.list;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("JAVA"); //String 객체 저장
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size(); //저장된 총 객체 수 얻기
        System.out.println("size: " + size);
        System.out.println();

        String skill = list.get(2); //2번 인덱스의 객체 얻기
        System.out.println("2: " + skill);
        System.out.println();

        for(int i=0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");

        int i = 0;
        for(String str : list) {
            System.out.println(i++ + ": " + str);
        }
    }
}
