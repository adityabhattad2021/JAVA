package problem6;
import problem6.*;

public class App {

    public static void main(String[] args) {
        Time t1 = new Time(10, 30);
        Time t2 = new Time(10, 30);
        System.out.println("IST: " + t1);
        System.out.println("EST: " + Timezone.convertISTtoEST(t1));
        System.out.println("EST: " + t2);
        System.out.println("IST: " + Timezone.convertESTtoIST(t2));
        t1.add(t2);
        System.out.println("Addition of t1 and t2: " +t1);
        t1.subtract(t2);
        System.out.println("Original time was: " +t1);

    }
    
}
