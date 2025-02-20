import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String str1 = scanner.next();
        System.out.println("Enter second string:");
        String str2 = scanner.next();
        
        System.out.println(compareStringsWithCharAt(str1, str2));
        System.out.println(str1.equals(str2));
    }

    public static boolean compareStringsWithCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
