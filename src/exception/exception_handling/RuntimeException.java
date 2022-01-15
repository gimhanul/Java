package exception.exception_handling;

public class RuntimeException {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;
        try {
            data1 = args[0];
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행매개값의개수가부족함니당.");
            return;
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;

            System.out.println(data1 + " + " + data2 + " = " + result);
        } catch(NumberFormatException e) {
            System.out.println("숫자로 변화할수업읍ㄴ디ㅏ");
        } finally {
            System.out.println("다시 실행하세용");
        }
    }
}
