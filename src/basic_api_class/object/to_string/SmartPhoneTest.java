package basic_api_class.object.to_string;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("apple", "ios");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone);
    }
}
