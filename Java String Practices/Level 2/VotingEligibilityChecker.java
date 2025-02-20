import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ages of 10 students:");
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = scanner.nextInt();
        }
        
        String[][] eligibility = checkVotingEligibility(ages);
        displayEligibility(eligibility);
    }

    public static int[] generateAges(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                eligibility[i][1] = "false";
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "true";
            } else {
                eligibility[i][1] = "false";
            }
        }
        return eligibility;
    }

    public static void displayEligibility(String[][] eligibility) {
        System.out.printf("%-10s %-20s%n", "Age", "Can Vote");
        System.out.println("---------- --------------------");
        for (String[] row : eligibility) {
            System.out.printf("%-10s %-20s%n", row[0], row[1]);
        }
    }
}
