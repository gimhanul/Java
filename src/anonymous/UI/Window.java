package anonymous.UI;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();

    Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("전화걸게용");
        }
    };

    Window() {
        button1.setOnClickListener(listener);
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메시지보낼게용");
            }
        });
    }
}
