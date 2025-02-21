import java.util.Scanner;

public class SubstringOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter substring to find: ");
        String subStr = sc.nextLine();
        
        int count = countSubstringOccurrences(str, subStr);
        System.out.println("Substring occurs " + count + " times.");
    }

    public static int countSubstringOccurrences(String str, String subStr) {
        int count = 0;
        int subStrLength = subStr.length();
        
        for (int i = 0; i <= str.length() - subStrLength; i++) {
            boolean isMatch = true;
            for (int j = 0; j < subStrLength; j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                count++;
            }
        }
        return count;
    }
}
