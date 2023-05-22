package problem2;

public class App {

    /*
     * Q2) The naive way of computing a value to the power n performs n
     * multiplications.
     * A much better algorithm, involves repeated squaring:
     * Example : pow(a, 1)=a
     * pow(a, n) = pow(a*a, n/2) [n even]
     * = a * pow(a*a, (n-1)/2) [odd]
     * Even this is not always optimal.
     * For example, it computes a15 via the sequence a; a2; a3; a6; a7; a14; a15 in
     * 6 steps
     * while it is possible to use a; a2; a4; a5; a10; a15 and manage in 5 steps.
     * Design a Java program that can be given any integer n and will find(by some
     * form
     * of exhaustive search) the smallest number of multiplications that could be
     * used to
     * raise a value to the power n.
     */
    public static void main(String[] args) {

    }

    public static int pow(int number,int exponent){
        if(exponent==0){
            return 1;
        }
        if(exponent==1){
            return number;
        }
        if(exponent%2==0){
            return pow(number*number,exponent/2);
        }
        else{
            return number*pow(number*number,(exponent-1)/2);
        }
    }

}
