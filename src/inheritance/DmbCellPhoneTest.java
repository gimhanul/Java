package inheritance;

public class DmbCellPhoneTest {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "red", 10);

        dmbCellPhone.showInfo();

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("여보아닌데요");
        dmbCellPhone.sendVoice("네끊겟읍니다");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(399);
        dmbCellPhone.turnOffDmb();
    }
}
