import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void takeInput() throws ArithmeticException {
        for (int x = 0; x < 10; x++) {
            int input = scanner.nextInt();
            if (input < 10) {
                throw new ArithmeticException("Input less than 10");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee();
        e1.setEmployee();
        e1.setPassword();
        System.out.println(e1);
    }
}
