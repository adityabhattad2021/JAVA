package problem5;
import problem5.*;

public class App {
    
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Audi", "MH-1234");
        Vehicle v2 = new Vehicle("BMW", "MP-1234");
        Vehicle v3 = new Vehicle("Mercedes", "AP-1234");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        Vehicle v4 = new Vehicle("ErrorCar", "WRONG-1234");
    }
}
