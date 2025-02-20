import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        
        int lengthCustom = getStringLength(inputString);
        int lengthBuiltIn = inputString.length();
        
        System.out.println("Custom method length: " + lengthCustom);
        System.out.println("Built-in method length: " + lengthBuiltIn);
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
}
