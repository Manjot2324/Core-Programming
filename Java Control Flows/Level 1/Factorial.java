import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number > 0) {
            int factorial = 1;
            while (number > 0) {
                factorial *= number;
                number--;
            }
            System.out.println("The factorial is " + factorial);
        } else {
            System.out.println("Please enter a positive integer");
        }
    }
}
