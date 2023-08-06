package Question1;

import Question1.FilePrinter.FilePrinter;

public class App {
    public static void main(String[] args) {
        // Get current directory
        // File thisDirectory= new File("./filw-handling/src/");
        // if(thisDirectory.isDirectory()){
        //     System.out.println("Current directory: "+thisDirectory.getAbsolutePath());
        //     System.out.println("Files in the current directory: ");
        //     for (File file : thisDirectory.listFiles()) {
        //         if(file.isFile()){
        //             System.out.println(file.getName()+" and it is a file");
        //         }else if(file.isDirectory()){
        //             System.out.println(file.getName()+" and it is a directory");
        //         }
        //     }
        // }
        try{
            FilePrinter fp = new FilePrinter();
            fp.getAllTheFilesInSpecifiedDirectory("./practice-questions", 0);
        }catch(Exception exception){
            System.out.println("There was an expected error: "+exception.getMessage());
        }
    }

}
