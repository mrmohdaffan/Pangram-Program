import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or string to check for pangram:");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Create a HashSet to store unique characters
        HashSet<Character> characterSet = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                characterSet.add(ch);
            }
        }

        // Check if the size of the HashSet is 26 (the number of letters in the
        // alphabet)
        return characterSet.size() == 26;
    }
}
