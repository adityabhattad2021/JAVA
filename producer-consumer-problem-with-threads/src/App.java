import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> sharedBuffer = new ArrayList<Integer>();
        int size = 10;
        Producer producer = new Producer(size, sharedBuffer);
        Consumer consumer = new Consumer(size, sharedBuffer);

        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                producer.produce();
            }
        });

        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
