import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
        String[] names = new String[size];
        
        System.out.println("Enter an index to access:");
        int index = scanner.nextInt();
        
        generateArrayIndexOutOfBoundsException(names, index);
        handleArrayIndexOutOfBoundsException(names, index);
    }

    public static void generateArrayIndexOutOfBoundsException(String[] names, int index) {
        System.out.println(names[index]);  
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names, int index) {
        try {
            System.out.println(names[index]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }
}
