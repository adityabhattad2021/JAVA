package ReadWrite;

import java.io.*;

public class ReadAndWriteFile {
    void copyOneFileToAnother(String inputFilePath, String outputFilePath) {
        try {
            FileInputStream inputStream = new FileInputStream(inputFilePath);
            FileOutputStream outputStream = new FileOutputStream(outputFilePath);
            int numberOfAvailableBytes = inputStream.available();
            for (int x = 0; x < numberOfAvailableBytes; x++) {
                int data = inputStream.read();
                outputStream.write(data);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("File copied successfully");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void copyAlternateCharacterFromOneFileToAnother(String inputFilePath, String outputFilePath) {
        try {
            FileInputStream inputStream = new FileInputStream(inputFilePath);
            FileOutputStream outputStream = new FileOutputStream(outputFilePath);
            int numberOfAvailableBytes = inputStream.available();
            for (int x = 0; x < numberOfAvailableBytes; x++) {
                int data = inputStream.read();
                if (x % 2 == 0) {
                    outputStream.write(data);
                }
            }
            inputStream.close();
            outputStream.close();
            System.out.println("File copied successfully");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void copyCharacterInUpperCaseFromOneFileToAnother(String inputFilePath, String outputFilePath) {
        try {
            FileInputStream inputStream = new FileInputStream(inputFilePath);
            FileOutputStream outputStream = new FileOutputStream(outputFilePath);
            int numberOfAvailableBytes = inputStream.available();
            for (int x = 0; x < numberOfAvailableBytes; x++) {
                int data = inputStream.read();
                if(data>=97 && data<=122){
                    outputStream.write(data - 32);
                }else{
                    outputStream.write(data);
                }
            }
            inputStream.close();
            outputStream.close();
            System.out.println("File copied successfully");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
