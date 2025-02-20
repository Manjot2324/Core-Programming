import java.util.Scanner;

public class LowercaseComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        String lowerCaseTextUserDefined = convertToLowerCaseWithCharAt(text);
        String lowerCaseTextBuiltIn = text.toLowerCase();
        
        System.out.println(lowerCaseTextUserDefined.equals(lowerCaseTextBuiltIn));
    }

    public static String convertToLowerCaseWithCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
