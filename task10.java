import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        scanner.close();

        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    }

    /**
     * This function finds the GCD of two numbers a and b using recursion with the Euclidean algorithm.
     */
    public static int findGCD(int a, int b) {
        // Base case: if b is zero, return a
        if (b == 0) {
            return a;
        }
        // Recursive case: call findGCD recursively with b and the remainder of a divided by b
        return findGCD(b, a % b);
    }
}
