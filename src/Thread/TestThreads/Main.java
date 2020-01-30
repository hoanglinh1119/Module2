package Thread.TestThreads;

public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator=new NumberGenerator();
        NumberGenerator1 numberGenerator1=new NumberGenerator1();
        Thread thread=new Thread();
        thread.start();
        numberGenerator.run();
        thread.setPriority(Thread.MAX_PRIORITY);
        Thread thread1=new Thread();
        thread1.start();
        numberGenerator1.run();
        thread1.setPriority(Thread.MIN_PRIORITY);

    }
}
