package mainPackage.core20.lesson;

import java.lang.reflect.Member;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        thread.join();
        RunnableThread runThread = new RunnableThread();
        runThread.run();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new MyThread());
        executor.execute(new RunnableThread());
        executor.shutdown();
    }
}
