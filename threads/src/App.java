import java.util.Random;

public class App {
    /*
     * Threads = A thread of execution in a program (kind of like virtual CPU)
     * The JVM allows an application to have multiple threads running concurrently
     * Each thread can execute parts of your code in parallel to the main thread
     * Each thread has a priority
     * Threads with higher priority are executed in preference to threads with lower
     * priority.
     * 
     * The JVM continues to execute a thread until either of the following happens
     * 1. The exit method of the class runtime has been called
     * 2. All user threads have died
     * 
     * When the JVM startsup, there is a thread which calls the main method, this
     * thread is called "main".
     * 
     * There are two types of thread User thread and Daemon thread, Daemon thread is
     * a low proirity thread that runs in the background to perform systen tasks.
     * JVM terminates itself when all the user threads (non-daemon threads) finishes
     * their execution.
     * 
     */
    public static void main(String[] args) throws Exception {
        // System.out.println(Thread.activeCount());
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getPriority());
        // System.out.println(Thread.currentThread().isAlive());

        // for(int i = 5;i>0;i--){
        // System.out.println(String.format("%d seconds left!",i));
        // Thread.sleep(1000);
        // }
        // System.out.println("Program executed successfully!");
        int a[] = new int[100];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }

        MyThread myThread = new MyThread(a, "Thread");
        myThread.start();
        myThread.join();
        // create an array of random number in java

        // Notice the order of the execution.
        // myThread.run();
        System.out.println(myThread.isAlive());
        System.out.println(myThread.getSum());
    }
}
