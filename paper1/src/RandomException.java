public class RandomException extends Exception{
    RandomException(int a){
        super("Invalid argument "+a+".");
    }
}
