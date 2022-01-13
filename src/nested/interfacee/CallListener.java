package nested.interfacee;

public class CallListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("전화건은중");
    }
}
