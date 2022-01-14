package anonymous.inheritance;

public class AnonymousTest {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.wake();
        anony.method1();
        anony.method2(
                new Person() {
                    void study() {
                        System.out.println("공부잉");
                    }

                    @Override
                    void wake() {
                        System.out.println("8시에 인남");
                        study();
                    }
                }
        );
    }
}
