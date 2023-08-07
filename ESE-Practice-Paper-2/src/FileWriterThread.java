import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileWriterThread {
    private ArrayList<String> sharedMemory;

    public FileWriterThread(ArrayList<String> sharedMemory) {
        this.sharedMemory = sharedMemory;
    }

    public void writeToOutputFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output-file.txt", true));
            synchronized (sharedMemory) {
                if (sharedMemory.size() == 0) {
                    sharedMemory.wait();
                }
                for (int x=0;x<sharedMemory.size();x++) {
                    bufferedWriter.write(sharedMemory.get(x));
                }
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
