package basic_api_class.string.method;

public class StringLengthTest {
    public static void main(String[] args) {
        String ssn = "123456789";
        int length = ssn.length();

        if(length == 9) {
            System.out.println("아홉자리마자용");
        } else {
            System.out.println("응안얘");
        }
    }
}
