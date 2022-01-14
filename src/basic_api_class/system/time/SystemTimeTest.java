package basic_api_class.system.time;

public class SystemTimeTest {
    public static void main(String[] args) {
        long nanoTs = System.nanoTime();
        long millTs = System.currentTimeMillis();

        int sum = 0;
        for(int i=1; i<=1000000; i++) {
            sum += i;
        }

        long nanoTe = System.nanoTime();
        long millTe = System.currentTimeMillis();

        System.out.println("1 ~ 100,0000 까지의 합: " + sum);
        System.out.println("걸린 시간");
        System.out.println((nanoTe - nanoTs) + "ns");
        System.out.println((millTe - millTs) + "ms");
    }
}
