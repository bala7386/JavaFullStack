public class palindrome {
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for comparison
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // Compare the string with its reverse
        return str.equals(reverseString(str));
    }
    
    // Function to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    // Function to check if a number is a palindrome
    public static boolean isPalindromeNumber(int num) {
        String str = String.valueOf(Math.abs(num));
        return str.equals(reverseString(str));
    }
    
    // Function to display palindrome check result
    public static void displayPalindromeResult(String input, boolean result) {
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
    
    // Main method to test palindrome functions
    public static void main(String[] args) {
        // Test string palindromes
        String test1 = "racecar";
        String test2 = "hello";
        String test3 = "A man a plan a canal Panama";
        
        System.out.println("--- String Palindrome Tests ---");
        displayPalindromeResult(test1, isPalindrome(test1));
        displayPalindromeResult(test2, isPalindrome(test2));
        displayPalindromeResult(test3, isPalindrome(test3));
        
        // Test number palindromes
        System.out.println("\n--- Number Palindrome Tests ---");
        int[] numbers = {121, 123, 1001, 12321, 100};
        for (int num : numbers) {
            if (isPalindromeNumber(num)) {
                System.out.println(num + " is a palindrome number.");
            } else {
                System.out.println(num + " is NOT a palindrome number.");
            }
        }
    }
}
