package aabstract.method;

public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("습 하 습 하");
    }

    public abstract void sound();
}
