package generic;

public class Plastic extends Material {
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력함.");
    }

    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}
