package basic_api_class.string.method;

public class StringEqualsTest {
    public static void main(String[] args) {
        String str1 = new String("김한울");
        String str2 = "김한울";

        if(str1 == str2) {
            System.out.println("같은 String 객체를 참조");
        } else {
            System.out.println("다른 String 객체를 참조");
        }

        if(str1.equals(str2)) {
            System.out.println("내용이 같아용");
        } else {
            System.out.println("내용이 달라여");
        }
    }
}
