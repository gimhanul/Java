package basic_api_class.string.method;

public class StringIndexOfTest {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        if(subject.indexOf("자바") != -1) { //"자바"가 포함되어 있으면
            System.out.println("자바와관련된책이네여");
        } else {
            System.out.println("자바와관련도없내여 ㅋㅋ");
        }
    }
}
