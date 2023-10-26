import java.util.Scanner;
import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInteger(String roman) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            if (!romanValues.containsKey(currentChar)) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + currentChar);
            }

            int currentVal = romanValues.get(currentChar);

            if (currentVal < prevValue) {
                result -= currentVal;
            } else {
                result += currentVal;
            }

            prevValue = currentVal;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        try {
            int integer = romanToInteger(romanNumeral);
            System.out.println("Integer equivalent: " + integer);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
