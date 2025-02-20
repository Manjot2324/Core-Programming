import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = scanner.next();
        
        generateNumberFormatException(str);
        handleNumberFormatException(str);
    }

    public static void generateNumberFormatException(String str) {
        int num = Integer.parseInt(str); 
    }

    public static void handleNumberFormatException(String str) {
        try {
            int num = Integer.parseInt(str); 
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }
}
