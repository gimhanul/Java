package lambda.parameter;

public class PrintStringTest {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("Hello Lambda!");
        showMyString(lambdaStr);
    }

    public static void showMyString(PrintString p) {
        p.showString("Hell Lambda!");
    }
}
