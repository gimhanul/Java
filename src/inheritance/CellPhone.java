package inheritance;

public class CellPhone {
    String model;
    String color;

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    void powerOff() {
        System.out.println("전원을 끕니다.");
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
