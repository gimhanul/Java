package thread.thread_stop.interrupt;

public class PrintThread extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("실행잉");
            if(Thread.interrupted()) {
                break;
            }
        }

        System.out.println("자원정링잉");
        System.out.println("어실행긑낫어");
    }
}
