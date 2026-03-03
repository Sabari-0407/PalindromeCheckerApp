

 UC9-RecursivePalindrome
public class  PalindromeCheckerApp{

    public static void main(String[] args) {

        String input = "madam";

        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    // Recursive function
    private static boolean check(String s, int start, int end) {

        // Base condition: if start >= end, it's palindrome
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}


=======
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        System.out.println("Input : " + input);

        // Normalize: remove non-alphanumeric characters & convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

