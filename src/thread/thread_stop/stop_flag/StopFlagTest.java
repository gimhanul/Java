package thread.thread_stop.stop_flag;

public class StopFlagTest {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        printThread.setStop(true);
    }
}
