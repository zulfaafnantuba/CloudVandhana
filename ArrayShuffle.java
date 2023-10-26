import java.util.Scanner;
import java.util.Random;

public class ArrayShuffle {
    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        shuffleArray(array);

        System.out.println("Shuffled array:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
