import java.util.Scanner;

public class divisibilityBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean divisibleBy5 = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + divisibleBy5);
    }
}
