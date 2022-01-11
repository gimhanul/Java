package abstract_class;

public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("켬");
    }
    public void turnOff() {
        System.out.println("끔");
    }
}
