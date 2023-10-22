import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Create a HashSet to store unique characters
        HashSet<Character> charSet = new HashSet<>();

        // Iterate through each character in the input
        for (char c : input.toCharArray()) {
            // Check if it's an alphabet character and add it to the set
            if (c >= 'a' && c <= 'z') {
                charSet.add(c);
            }
        }

        // If the size of the set is 26 (number of letters in the alphabet), it's a pangram
        return charSet.size() == 26;
    }
}
