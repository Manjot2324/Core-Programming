import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        int terms = getInput("Enter the number of terms in the Fibonacci sequence: ");
        printFibonacci(terms);
    }

    public static int getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    public static void printFibonacci(int terms) {
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
