import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();
        
        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + interest);
    }
}
