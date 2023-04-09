import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        scanner.close();

        if (isAllDigits(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * This function checks whether the given string contains only digits or not.
     */
    public static boolean isAllDigits(String s) {
        // Check if the string is null or empty
        if (s == null || s.isEmpty()) {
            return false;
        }

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the character is not a digit, return false
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        // If all characters are digits, return true
        return true;
    }
}



