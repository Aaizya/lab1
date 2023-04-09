import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is composite");
        }
    }

    /**
     * This function takes an integer n as input and returns true if n is prime,
     * and false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


