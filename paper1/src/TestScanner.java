import java.util.Scanner;

public class TestScanner{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        scanner.close();
    }
}