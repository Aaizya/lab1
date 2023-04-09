import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base: ");
        double a = input.nextDouble();
        System.out.print("Enter an exponent: ");
        int n = input.nextInt();
        double result = power(a, n);
        System.out.println(a + " to the power of " + n + " is: " + result);
    }

    /**
     * This recursive function takes a double a and an integer n as input and returns
     * the value of a to the power of n. If n is negative, then 1/a is multiplied recursively
     * until n becomes 0. If n is positive, then a is multiplied recursively until n becomes 0.
     * If n is 0, then the result is 1.
     */
    public static double power(double a, int n) {
        if (n < 0) {
            return 1 / power(a, -n);
        } else if (n > 0) {
            return a * power(a, n - 1);
        } else {
            return 1;
        }
    }
}
