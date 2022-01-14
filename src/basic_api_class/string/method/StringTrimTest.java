package basic_api_class.string.method;

public class StringTrimTest {
    public static void main(String[] args) {
        String str1 = "       02         ";
        String str2 = "123           ";
        String str3 = "   4567";

        String tel = str1.trim() + str2.trim() + str3.trim();
        System.out.println(tel);
    }
}
