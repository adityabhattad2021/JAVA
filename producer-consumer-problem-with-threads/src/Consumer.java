import java.util.ArrayList;

public class Consumer {

    ArrayList<Integer> sharedBuffer;
    int size;
    int count;

    public Consumer(int size, ArrayList<Integer> sharedBuffer) {
        this.size = size;
        this.sharedBuffer = sharedBuffer;
    }

    public void consume() {
        int a=0;
        while (a<8) {
            synchronized (sharedBuffer) {
                if (sharedBuffer.size() == 0) {
                    try {
                        sharedBuffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumed: " + sharedBuffer.remove(0));
                sharedBuffer.notify();
                a++;
            }
        }
    }
}
