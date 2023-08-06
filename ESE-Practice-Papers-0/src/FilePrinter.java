import java.io.*;


public class FilePrinter {
    public static void printAllFilesAndDirectories(String path,int spaces) throws IOException{
        File supposedDirectory = new File(path);
        if(supposedDirectory.isDirectory()){
            for(int x=0;x<spaces;x++){
                System.out.printf(" ");
            }
            System.out.printf("Directory name is: %s\n",supposedDirectory.getName());
            File[] childrens = supposedDirectory.listFiles();
            spaces++;
            for(File f:childrens){
                printAllFilesAndDirectories(f.getAbsolutePath(),spaces);
            }
        }else if(supposedDirectory.isFile()){
            for(int x=0;x<spaces;x++){
                System.out.printf(" ");
            }
            System.out.printf("File name is: %s\n",supposedDirectory.getName());
        }
    }
}
