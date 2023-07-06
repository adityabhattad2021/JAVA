import java.util.ArrayList;

public class Producer {
    ArrayList <Integer> sharedBuffer;
    int size;
    int count;

    public Producer(int size, ArrayList<Integer> sharedBuffer) {
        this.size = size;
        this.sharedBuffer = sharedBuffer;
    }

    public void produce() {
        int a=0;
        while (a<10) {
            synchronized (sharedBuffer) {
                if (sharedBuffer.size() == size) {
                    try {
                        sharedBuffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                sharedBuffer.add(1);
                System.out.println("Produced: " + 1);
                sharedBuffer.notify();
            }
            a++;
        }
    }
}
