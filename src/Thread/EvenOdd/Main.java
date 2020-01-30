package Thread.EvenOdd;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new EvenThread();
        Thread thread1=new OddThread();
        thread.start();
        thread1.start();
        thread1.join();

    }
}
