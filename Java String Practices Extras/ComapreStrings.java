import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        
        int comparisonResult = compareStrings(str1, str2);
        
        if (comparisonResult < 0) {
            System.out.println(str1 + " comes before " + str2 + " lexicographically.");
        } else if (comparisonResult > 0) {
            System.out.println(str1 + " comes after " + str2 + " lexicographically.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1;
            }
        }
        
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1;
        }
        
        return 0;
    }
}
