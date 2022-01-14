package basic_api_class.string.method;

public class StringSubstringTest {
    public static void main(String[] args) {
        String ssn = "050415-4000000";

        String firstNum = ssn.substring(0, 6);
        String secondNum = ssn.substring(7);

        System.out.println(firstNum);
        System.out.println(secondNum);
    }
}
