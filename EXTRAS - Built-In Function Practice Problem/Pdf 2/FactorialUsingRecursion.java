import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        int number = getInput("Enter a number to calculate its factorial: ");
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }

    public static int getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
