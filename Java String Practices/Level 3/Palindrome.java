import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingArray(String text) {
        char[] arr = text.toCharArray();
        char[] reversed = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Palindrome (Method 1): " + isPalindrome(text));
        System.out.println("Palindrome (Method 2 - Recursive): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Palindrome (Method 3 - Using Array): " + isPalindromeUsingArray(text));
    }
}
