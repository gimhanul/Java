package interfacee;

public class SmartTelevisionTest {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable sa = tv;
    }
}
