package basic_api_class.system.exit;

public class ExitTest {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.println(i);
            if(i == 5) {
                System.exit(0);
            }
        }
        System.out.println("끝");
    }
}
