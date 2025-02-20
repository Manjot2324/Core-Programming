import java.util.Scanner;

public class CharArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = scanner.next();
        
        char[] charArrayUserDefined = getCharArray(str);
        char[] charArrayBuiltIn = str.toCharArray();
        
        System.out.println(compareCharArrays(charArrayUserDefined, charArrayBuiltIn));
    }

    public static char[] getCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
