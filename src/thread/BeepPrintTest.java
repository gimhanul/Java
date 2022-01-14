package thread;

import java.awt.Toolkit;

public class BeepPrintTest {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++) {
            toolkit.beep(); //비프음 발생
            try { Thread.sleep(500); } catch(Exception e) {} //0.5초간 일시정지
        }

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

//비프음을 발생시키며 동시에 출력할 수 없음.