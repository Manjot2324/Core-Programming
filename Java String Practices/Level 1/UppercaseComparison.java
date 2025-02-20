import java.util.Scanner;

public class UppercaseComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        String upperCaseTextUserDefined = convertToUpperCaseWithCharAt(text);
        String upperCaseTextBuiltIn = text.toUpperCase();
        
        System.out.println(upperCaseTextUserDefined.equals(upperCaseTextBuiltIn));
    }

    public static String convertToUpperCaseWithCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
