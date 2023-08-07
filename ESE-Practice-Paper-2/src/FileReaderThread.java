import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileReaderThread {
    private ArrayList<String> sharedMemory;

    public FileReaderThread(ArrayList<String> sharedMemory) {
        this.sharedMemory = sharedMemory;
    }

    public void readFile(String fileToRead) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToRead));
            synchronized (sharedMemory) {
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    for (String word : line.split(" ")) {
                        sharedMemory.add(word);
                    }
                }
                sharedMemory.notifyAll();
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
