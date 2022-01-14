package basic_api_class.string.constructor;

public class ByteToStringTest {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; //Hello Java

        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = new String(bytes, 6, 4);
        System.out.println(str2);
    }
}
