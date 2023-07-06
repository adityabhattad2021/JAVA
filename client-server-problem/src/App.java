import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int size = 1;
        ArrayList<Integer> scoreBoard = new ArrayList<>(size);

        Server server = new Server(size, scoreBoard);

        Client client = new Client(size, scoreBoard);

        Thread serverThread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    int a = 0;
                    while (true) {
                        server.publish(a);
                        Thread.sleep(1000);
                        a++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread clientThread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                client.read();
            }
        });
        Thread clientThread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                client.read();
            }
        });
        Thread clientThread3 = new Thread(new Runnable() {

            @Override
            public void run() {
                client.read();
            }
        });

        serverThread.start();

        clientThread1.start();
        clientThread2.start();
        clientThread3.start();
    }
}
