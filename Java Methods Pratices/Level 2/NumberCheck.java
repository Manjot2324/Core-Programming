import java.util.Scanner;

public class NumberCheck {
    public static String checkPositiveOrNegative(int number) {
        if (number < 0) return "Negative";
        return "Positive";
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) return "Even";
        return "Odd";
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 == num2) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            
            System.out.println(checkPositiveOrNegative(numbers[i]));
            if (numbers[i] >= 0) {
                System.out.println(checkEvenOrOdd(numbers[i]));
            }
        }
        
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than last number.");
        } else if (result == 0) {
            System.out.println("First number is equal to last number.");
        } else {
            System.out.println("First number is smaller than last number.");
        }
    }
}
