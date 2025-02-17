import java.util.Scanner;

public class CalcBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus: " + bonus);
    }
}
