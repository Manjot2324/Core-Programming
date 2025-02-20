import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = scanner.next();
        
        generateIllegalArgumentException(str);
        handleIllegalArgumentException(str);
    }

    public static void generateIllegalArgumentException(String str) {
        System.out.println(str.substring(5, 3)); 
    }

    public static void handleIllegalArgumentException(String str) {
        try {
            System.out.println(str.substring(5, 3));  
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }
}
