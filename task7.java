import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("The reversed array is:");
        printReverse(arr, n - 1);
    }

    /**
     * This function recursively prints the elements of an array in reverse order.
     */
    public static void printReverse(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        printReverse(arr, index - 1);
    }
}
