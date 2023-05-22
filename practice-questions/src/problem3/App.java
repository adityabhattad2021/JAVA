package problem3;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    // According to my interpretation of the question, possible solution could be
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Integer> integerValues = new ArrayList<Integer>();

    public static void createArrayForNumber(int numerator, int denominator) {
        String decimalRepresentation = String.valueOf((double) numerator / denominator);
        for (int x = 0; x < decimalRepresentation.length(); x++) {
            integerValues.add(decimalRepresentation.charAt(x) - '0');
        }
        for (int x = 0; x < integerValues.size(); x++) {
            if (integerValues.get(x) == -2) {
                for (int y = 0; y <= x; y++) {
                    integerValues.remove(0);
                }
                return;
            }
        }
    }

    public static String createArrayForNumber(double number) {
        String wholeNumberPart = "";
        String decimalRepresentation = String.valueOf(number);
        for (int x = 0; x < decimalRepresentation.length(); x++) {
            integerValues.add(decimalRepresentation.charAt(x) - '0');
        }
        for (int x = 0; x < integerValues.size(); x++) {
            if (integerValues.get(x) == -2) {
                for (int y = 0; y <= x; y++) {
                    int removedInt = integerValues.remove(0);
                    wholeNumberPart += String.valueOf(removedInt);
                }
                break;
            }
        }
        wholeNumberPart = wholeNumberPart.substring(0, wholeNumberPart.length() - 2);
        return wholeNumberPart;
    }

    public static double arrayToDouble() {
        String number = "0.";
        for (int x = 0; x < integerValues.size(); x++) {
            number += String.valueOf(integerValues.get(x));
        }
        return Double.valueOf(number);
    }

    public static void main(String[] args) {
        createArrayForNumber(1, 7);
        System.out.println(integerValues);
        double numberToMultiply = arrayToDouble();
        integerValues.clear();
        System.out.println("Enter the number to multiply the element with: ");
        int multi = scanner.nextInt();
        double newDouble = numberToMultiply * multi;
        System.out.println(newDouble);
        String wholeNumberPart = createArrayForNumber(newDouble);
        System.out.println("Whole number part is: " + Integer.valueOf(wholeNumberPart));
        System.out.println("Decimal array is " + integerValues);

    }

}
