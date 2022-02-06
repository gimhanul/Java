package generic;

public class Powder {
    public void doPrinting() {
        System.out.println("Powder 재료로 출력함.");
    }

    @Override
    public String toString() {
        return "재료는 Powder 입니다.";
    }
}
