

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "refer";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        // Flag to track palindrome
        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}





