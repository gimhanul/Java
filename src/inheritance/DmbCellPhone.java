package inheritance;

public class DmbCellPhone extends CellPhone {
    int channel;
    boolean gojang = false;

    DmbCellPhone(String model, String color, int channel) {
        super(model, color);
        this.channel = channel;
    }

    @Override
    void bell() {
        if(!isGojang()) {
            System.out.println("뎸비뎸비우왕우왕띠링띠링");
        }
        else {
            super.bell();
            System.out.println("고장낫따. 고치렴");
        }

    }
    boolean isGojang() {
        return gojang;
    }
    void setGojang(boolean gojang) {
        this.gojang = gojang;
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
