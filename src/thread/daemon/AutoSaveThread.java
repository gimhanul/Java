package thread.daemon;

public class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("저장잉");
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                break;
            }
            save();
        }
    }
}
