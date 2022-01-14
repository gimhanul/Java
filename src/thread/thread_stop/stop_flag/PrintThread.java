package thread.thread_stop.stop_flag;

public class PrintThread extends Thread {
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while(!stop) {
            System.out.println("실행잉");
        }

        System.out.println("자원정ㄹ링잉");
        System.out.println("실행긑");
    }
}
