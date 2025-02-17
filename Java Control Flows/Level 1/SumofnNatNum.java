import java.util.Scanner;

public class SumofnNatNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n > 0) {
            int sumUsingWhile = 0;
            int sumFormula = (n * (n + 1)) / 2;

            int i = 1;
            while (i <= n) {
                sumUsingWhile += i;
                i++;
            }

            System.out.println("Sum using while loop: " + sumUsingWhile);
            System.out.println("Sum using formula: " + sumFormula);
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
