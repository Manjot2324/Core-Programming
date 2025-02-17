import java.util.Scanner;

public class StudentGrades2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[][] marks = new double[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                double mark = -1;
                while (mark < 0) {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print("Enter marks for " + subject + ": ");
                    mark = sc.nextDouble();
                    if (mark < 0) {
                        System.out.println("Marks cannot be negative. Please enter again.");
                    }
                }
                marks[i][j] = mark;
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (totalMarks / 300) * 100;
            percentages[i] = percentage;

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Marks in Physics: " + marks[i][0]);
            System.out.println("Marks in Chemistry: " + marks[i][1]);
            System.out.println("Marks in Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }

    }
}
