package classs;

public class CalculatorTest {
    public static void main(String[] args) {
        double result = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 2);
        int result3 = Calculator.minus(40,13);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
