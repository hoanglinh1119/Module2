package Thread.TestThreads;

public class NumberGenerator1 implements Runnable {

    @Override
    public void run() {
    for (int i=0;i<10;i++){
        System.out.println(i+1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}
