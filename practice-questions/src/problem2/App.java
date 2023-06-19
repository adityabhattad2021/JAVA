package problem2;

public class App {

    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        if (exponent % 2 == 0) {
            int temp = pow(base, exponent / 2);
            return temp * temp;
        } else {
            int temp = pow(base, (exponent - 1) / 2);
            return base * temp * temp;
        }
    }


    public static void main(String[] args) {
        int result = pow(2,15);
        System.out.println(result);
    }
}
