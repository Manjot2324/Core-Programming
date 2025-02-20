import java.util.Scanner;

public class StringTrimmer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        int[] trimIndexes = trimSpaces(inputString);
        String customTrimmedString = customSubstring(inputString, trimIndexes[0], trimIndexes[1]);
        String builtInTrimmedString = inputString.trim();
        
        boolean areEqual = compareStrings(customTrimmedString, builtInTrimmedString);
        
        System.out.println("Custom trimmed string: \"" + customTrimmedString + "\"");
        System.out.println("Built-in trimmed string: \"" + builtInTrimmedString + "\"");
        System.out.println("Are the trimmed strings equal? " + areEqual);
    }

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static int[] trimSpaces(String str) {
        int length = getStringLength(str);
        int start = 0;
        int end = length - 1;
        
        while (start < length && str.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end + 1};
    }

    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        int length1 = getStringLength(str1);
        int length2 = getStringLength(str2);
        
        if (length1 != length2) {
            return false;
        }
        
        for (int i = 0; i < length1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}
