import java.util.Scanner;

public class cmtoftin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) inches / 12;
        inches = inches % 12;

        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
    }
}
