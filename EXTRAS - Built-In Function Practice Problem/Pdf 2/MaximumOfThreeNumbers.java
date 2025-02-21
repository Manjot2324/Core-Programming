import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");
        
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum value is: " + max);
    }

    public static int getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    public static int findMax(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
