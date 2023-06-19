package Question1;
import java.io.File;
import java.io.IOException;

public class FilePrinter {
    public void getAllTheFilesInSpecifiedDirectory(String directoryName,int spaces) throws IOException {
        File thisDirectory = new File(directoryName);
        if(thisDirectory.isDirectory()){
            for(int x=0;x<spaces;x++){
                System.out.printf(" ");
            }
            System.out.printf("Directory Name is: %s\n",thisDirectory.getName());
            spaces++;
            File[] childrens = thisDirectory.listFiles();
            for(File f:childrens){
                getAllTheFilesInSpecifiedDirectory(f.getAbsolutePath(), spaces);
            }
        }else if(thisDirectory.isFile()){
            for(int x=0;x<spaces;x++){
                System.out.printf(" ");
            }
            System.out.printf("File name is %s\n",thisDirectory.getName());
        }
    }
}
