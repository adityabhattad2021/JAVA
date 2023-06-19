package ReadWrite;


public class App {
    public static void main(String[] args) {
        ReadAndWriteFile rAf = new ReadAndWriteFile();
        // rAf.copyAlternateCharacterFromOneFileToAnother("./file-handling/src/file-folder/just-a-file.txt", "./file-handling/src/file-folder/test-file.txt");
        rAf.copyCharacterInUpperCaseFromOneFileToAnother("./file-handling/src/file-folder/test-file.txt", "./file-handling/src/file-folder/just-a-file.txt");
    }
}

