package abstract_class;

public class PhoneTest {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("김한울");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
