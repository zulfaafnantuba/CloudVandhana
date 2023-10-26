import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        boolean[] alphabetPresent = new boolean[26];
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabetPresent[index] = true;
            }
        }

        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false; // If any letter is not present, it's not a pangram
            }
        }
        return true; // All letters from 'a' to 'z' are present
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        boolean isPangram = isPangram(inputSentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }
}
