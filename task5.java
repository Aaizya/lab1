import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int fibonacci = findFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci);
    }

    /**
     * This recursive function takes an integer n as input and returns the n-th number in the
     * Fibonacci sequence. The base cases are F0 = 0 and F1 = 1. For any n > 1, Fn = Fn-1 + Fn-2.
     */
    public static int findFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacci(n - 1) + findFibonacci(n - 2);
        }
    }
}
