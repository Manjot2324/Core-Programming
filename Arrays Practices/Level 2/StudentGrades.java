import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] marks = new double[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            double physics = -1, chemistry = -1, maths = -1;

            while (physics < 0) {
                System.out.print("Enter marks for Physics: ");
                physics = sc.nextDouble();
                if (physics < 0) {
                    System.out.println("Marks cannot be negative. Please enter again.");
                }
            }

            while (chemistry < 0) {
                System.out.print("Enter marks for Chemistry: ");
                chemistry = sc.nextDouble();
                if (chemistry < 0) {
                    System.out.println("Marks cannot be negative. Please enter again.");
                }
            }

            while (maths < 0) {
                System.out.print("Enter marks for Maths: ");
                maths = sc.nextDouble();
                if (maths < 0) {
                    System.out.println("Marks cannot be negative. Please enter again.");
                }
            }

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;
            double totalMarks = physics + chemistry + maths;
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
