import java.util.Scanner;

public class GCDandLCMCalculator {

    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        
        int gcd = gcd(num1, num2);
        int lcm = lcm(num1, num2);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
