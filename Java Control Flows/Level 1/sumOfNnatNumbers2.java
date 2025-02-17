import java.util.Scanner;

public class sumOfNnatNumbers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n > 0) {
            int sumUsingFor = 0;
            int sumFormula = (n * (n + 1)) / 2;

            for (int i = 1; i <= n; i++) {
                sumUsingFor += i;
            }

            System.out.println("Sum using for loop: " + sumUsingFor);
            System.out.println("Sum using formula: " + sumFormula);
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
