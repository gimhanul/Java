package basic_api_class.wrapper;

public class ValueCompareTest {
    public static void main(String[] args) {
        System.out.println("[-128 ~ 127] 초과값일 경우");
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==: " + (obj1 == obj2));
        System.out.println("Unboxing ==: " + (obj1.intValue() == obj2.intValue()));
        System.out.println("equals(): " + obj1.equals(obj2));
        System.out.println();


        System.out.println("[-128 ~ 127] 범위값일 경우");
        Integer obj3 = 30;
        Integer obj4 = 30;
        System.out.println("==: " + (obj3 == obj4));
        System.out.println("Unboxing ==: " + (obj3.intValue() == obj4.intValue()));
        System.out.println("equals(): " + obj3.equals(obj4));

    }
}
