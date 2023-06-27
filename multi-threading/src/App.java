public class App {
    /*
     * Multithreading = Process of executing multiple threads simultaneously.
     * Helps in max utilization of the CPU
     * - Threads are independant and they do not affect the execution of other threads.
     * - An execption in one thread will not inerrupt other threads
     * - It is useful of serving multiple clients all at once, and one of the most useful feature of programming languages according to me.
     */
    public static void main(String[] args) throws Exception {
        // Two ways of using threads,both does the same thing.
        // but if we prefer to use the thread by implementing the runnable interface, we can still use inheritance in that class which will not be possible, if we extend the thread class as in JAVA there can only be one parent class.
        MyThread thread1 = new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
