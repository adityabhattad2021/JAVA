import java.util.ArrayList;
import java.util.Scanner;

public class twoD_arraylist {
    public static void main(String[] args) {
        // 2D ArrayList = A dynamic list of lists.
        // You can change the size of this list during the run time.
        ArrayList<ArrayList> fullNames = new ArrayList();

        ArrayList<String> firstNames = new ArrayList<String>();
        ArrayList<String> lastNames = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        String toStop;
        do {
            System.out.println("Enter a first name");
            String fName = scanner.nextLine();
            firstNames.add(fName);
            System.out.println("Enter a last name");
            String lName = scanner.nextLine();
            lastNames.add(lName);
            System.out.println("Do you wanna stop");
            toStop = scanner.nextLine();
        } while (!toStop.equalsIgnoreCase("y"));
        
        fullNames.add(firstNames);
        fullNames.add(lastNames);
        System.out.println(fullNames);

        scanner.close();
    }
}
