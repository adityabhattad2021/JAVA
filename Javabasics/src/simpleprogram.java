import java.util.Scanner;

public class simpleprogram {
    public static void main(String[] args) {
        double s1, s2, s3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        s1 = scanner.nextDouble();
        System.out.println("Enter side 2: ");
        s2 = scanner.nextDouble();
        s3 = Math.sqrt(s1 * s1 + s2 * s2);
        System.out.println("Thy hypotenuse is: " + s3);
        scanner.close();
    }
}
