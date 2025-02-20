import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = scanner.next();
        
        generateStringIndexOutOfBoundsException(str);
        handleStringIndexOutOfBoundsException(str);
    }

    public static void generateStringIndexOutOfBoundsException(String str) {
        System.out.println(str.charAt(str.length()));  
    }

    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            System.out.println(str.charAt(str.length()));  
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }
}
