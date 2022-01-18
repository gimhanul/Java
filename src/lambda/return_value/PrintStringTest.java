package lambda.return_value;

public class PrintStringTest {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("Hello Lambda!");
        showMyString(lambdaStr);

        PrintString reStr = returnString();
        reStr.showString("Hello");
    }

    public static void showMyString(PrintString p) {
        p.showString("Hell Lambda!");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + " World!");
    }
}
