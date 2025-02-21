import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter character to remove: ");
        char toRemove = sc.next().charAt(0);
        
        String result = removeSpecificCharacter(str, toRemove);
        System.out.println("Modified String: " + result);
    }

    public static String removeSpecificCharacter(String str, char toRemove) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != toRemove) {
                result += str.charAt(i);
            }
        }
        
        return result;
    }
}
