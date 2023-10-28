// import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input to lowercase to make it case-insensitive
        input = input.toLowerCase();

        // Create an array to mark the presence of letters from 'a' to 'z'
        boolean[] letters = new boolean[26];

        // Iterate through the characters in the input and mark the letters as present
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are marked as present
        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
