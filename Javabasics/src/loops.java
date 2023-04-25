import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        String name = "Name";
        String toInput;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your name in the input field: ");
            toInput = scanner.nextLine();

        } while (!toInput.equals(name));

        for (; true;) {
            System.out.println("Enter your name in the input field: ");
            toInput = scanner.nextLine();
            if (toInput.equals(name)) {
                break;
            }
        }
        scanner.close();
    }
}
