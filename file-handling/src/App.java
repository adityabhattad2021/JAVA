import java.io.*;
import java.util.Date;


public class App {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
        // // All File methods with examples
        // System.out.println("File Name: " + file.getName());
        // System.out.println("File Path: " + file.getAbsolutePath());
        // System.out.println("File Size: " + file.length()+" bytes");
        // System.out.println("File can be read: " + file.canRead());
        // System.out.println("File can be written: " + file.canWrite());
        // System.out.println("File Parent: " + file.getParent());
        // System.out.println("File is a directory: " + file.isDirectory());
        // System.out.println("File is a file: " + file.isFile());
        // System.out.println("File is hidden: " + file.isHidden());
        // System.out.println("File last modified: " + new Date(file.lastModified()).toString());
        // // Return unix timestamp of the last modified date
        // System.out.println("File last modified: " + file.lastModified());
        // System.out.println("File list: " + file.list());
        // // System.out.println("File list root: " + file.listRoots());
        // System.out.println("File to URI: " + file.toURI());
        // System.out.println("File to String: " + file.toString());
        // System.out.println("File to Path: " + file.toPath());
        // Write in the file,
        FileWriter writer = new FileWriter(file,true);
        writer.write("1This is a test file.");
        writer.write("2This is a again a test file.");
        writer.close();

        // Create a directory
        File dir = new File("file-handling\\src\\file-folder");
        if(!dir.exists()){
            if (dir.mkdir()) {
                System.out.println("Directory created: " + dir.getName());
            } else {
                System.out.println("Directory already exists.");
            }
        }
        // Move the file to the directory
        File newFile = new File("file-handling\\src\\file-folder\\test-file.txt");
        try{
            file.renameTo(newFile);
            System.out.println("File moved successfully.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
