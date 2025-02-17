import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics = sc.nextDouble();

        double chemistry = sc.nextDouble();

        double maths = sc.nextDouble();

        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;
        double average = totalMarks / 3;

        System.out.println("Total Marks: " + totalMarks + " / 300");
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade: A (Level 4, above agency-normalized standards)");
        } else if (percentage >= 70) {
            System.out.println("Grade: B (Level 3, at agency-normalized standards)");
        } else if (percentage >= 60) {
            System.out.println("Grade: C (Level 2, below, but approaching agency-normalized standards)");
        } else if (percentage >= 50) {
            System.out.println("Grade: D (Level 1, well below agency-normalized standards)");
        } else if (percentage >= 40) {
            System.out.println("Grade: E (Level 1-, too below agency-normalized standards)");
        } else {
            System.out.println("Grade: R (Remedial standards)");
        }

    }
}
