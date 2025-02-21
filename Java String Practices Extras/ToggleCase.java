import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        String toggled = toggleCase(str);
        System.out.println("Toggled string: " + toggled);
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 'a' + 'A'));
            } else if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch - 'A' + 'a'));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
