package thread.thread_stop.interrupt;

public class PrintThread extends Thread {
    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("실행잉");
                Thread.sleep(1);
            }
        } catch(InterruptedException e) {}

        System.out.println("자원정링잉");
        System.out.println("어실행긑낫어");
    }
}
