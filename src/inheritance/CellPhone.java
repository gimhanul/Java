package inheritance;

public class CellPhone {
    public static final boolean OFF = false;
    public static final boolean ON = true;

    String model;
    String color;
    boolean now = OFF;

    CellPhone(String model, String color) {
        this.model = model;
        this.color = color;

    }
    void pressPowerButton() {
        if(now == ON) {
            System.out.println("꺼집니다");
            now = OFF;
        }
        else {
            System.out.println("켜집니다");
            now = ON;
        }
    }
    void bell() {
        System.out.println("띠링띠링");
    }
    void sendVoice(String message) {
        System.out.println("나: "+message);
    }
    void receiveVoice(String message) {
        System.out.println("상대: "+message);
    }
    void hangUp() {
        System.out.println("뚜뚜뚜");
    }
}
