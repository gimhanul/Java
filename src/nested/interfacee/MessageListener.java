package nested.interfacee;

public class MessageListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("메시지보낸은중");
    }
}
