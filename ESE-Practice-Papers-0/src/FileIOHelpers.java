import java.io.*;
import java.util.Scanner;

public class FileIOHelpers {
    public static void copyFromOneFileToAnother(String inputFilePath,String outputFilePath) throws IOException {
        File inputFile = new File(inputFilePath);
        File outputFile = new File(outputFilePath);
        if(!inputFile.exists()){
            System.err.println("File does not exists");
        }
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        int numberOfAvailableBytes = fileInputStream.available();
        while(numberOfAvailableBytes!=0){
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            numberOfAvailableBytes--;
        }
        fileInputStream.close();
        fileOutputStream.close();
    }    

    public static void copyFromOneFileToAnotherCapitilized(String inputFilePath,String outputFilePath) throws IOException{
        File inputFile = new File(inputFilePath);
        File outputFile  = new File(outputFilePath);
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        int numberOfAvailableBytes = fileInputStream.available();
        while(numberOfAvailableBytes!=0){
            int data = fileInputStream.read();
            if(data>=97 && data<=122){
                fileOutputStream.write(data-32);
            }else{
                fileOutputStream.write(data);
            }
            numberOfAvailableBytes--;
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void writeInCapitalAndNormal(String toWrite) throws IOException{
        File normalCasing = new File("normal-casing.txt");
        File upperCasing = new File("upper-casing.txt");
        FileWriter fileWriter1 = new FileWriter(normalCasing);
        FileWriter fileWriter2 = new FileWriter(upperCasing);
        BufferedWriter  bufferedWriter1 = new BufferedWriter(fileWriter1);
        BufferedWriter  bufferedWriter2 = new BufferedWriter(fileWriter2);
        bufferedWriter1.write(toWrite);
        String capitilized = toWrite.toUpperCase();
        bufferedWriter2.write(capitilized);
        bufferedWriter1.close();
        bufferedWriter2.close();
        System.out.println("File written successfully!");
    }
}

