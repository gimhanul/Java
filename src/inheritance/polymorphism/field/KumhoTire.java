package inheritance.polymorphism.field;

public class KumhoTire extends Tire{
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println("["+location+"] 금호 타이어 수명: "+(maxRotation - accumulatedRotation)+" 회");
            return true;
        }
        else {
            System.out.println("["+location+"] 금호 타이어 펑크!!!!");
            return false;
        }
    }
}
