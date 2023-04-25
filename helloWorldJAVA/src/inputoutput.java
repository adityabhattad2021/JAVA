import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What the heck is your name: ");
        String name = scanner.nextLine();
        System.out.println("And your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourite food: ");
        String favFood = scanner.nextLine();
        scanner.close();
        System.out.println("Your name: "+name+".\nYour age: "+age+".\nYour food is: "+favFood+".");
    }
}
