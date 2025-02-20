import java.util.Scanner;

public class SumNaturalNumbersRecursion {
    public static int sumUsingRecursion(int n) {
        if (n == 1) return 1;
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("Not a valid natural number");
            return;
        }
        
        int recursionSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);
        
        System.out.println("Sum using recursion: " + recursionSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Both results match: " + (recursionSum == formulaSum));
    }
}
