package anonymous.interfacee;

public class AnonymousTest {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.turnOn();
        anony.method1();
        anony.method2(
                new RemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("SmartTV 켬");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("SmartTV 끔");
                    }
                }
        );
    }
}
