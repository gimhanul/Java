package interfacee.polymorphism.casting;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("BUS 가는ing");
    }

    public void checkFare() {
        System.out.println("승차요금체크ing");
    }
}
