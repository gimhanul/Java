package inheritance;

public class DmbCellPhone extends CellPhone{
    int channel;

    DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println("["+channel+"] DMB 방송 수신을 스따또");
    }
    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("["+channel+"] 채널 변경");
    }
    void turnOffDmb() {
        System.out.println("------뚜뚜뚜----------");
    }
    void showInfo() {
        System.out.println("model: "+model);
        System.out.println("color: "+color);
        System.out.println("channel: "+channel);
    }
}
