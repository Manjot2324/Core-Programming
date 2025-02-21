import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first date (yyyy-MM-dd): ");
        String firstDateStr = sc.nextLine();
        
        System.out.println("Enter second date (yyyy-MM-dd): ");
        String secondDateStr = sc.nextLine();
        
        LocalDate firstDate = LocalDate.parse(firstDateStr);
        LocalDate secondDate = LocalDate.parse(secondDateStr);
        
        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is before second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is after second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}
