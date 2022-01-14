package basic_api_class.string.method;

public class StringCharAtTest {
    public static void main(String[] args) {
        String ssn = "050415-4000000";
        char sex = ssn.charAt(7);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
        }
    }
}
