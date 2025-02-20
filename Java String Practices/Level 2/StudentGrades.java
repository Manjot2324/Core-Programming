import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = 5;
        int[][] marks = new int[numStudents][3];
        double[][] results = new double[numStudents][4];
        String[][] grades = new String[numStudents][1];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        for (int i = 0; i < numStudents; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(percentage * 100.0) / 100.0;
        }

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][3];
            if (percentage >= 80) grades[i][0] = "A";
            else if (percentage >= 70) grades[i][0] = "B";
            else if (percentage >= 60) grades[i][0] = "C";
            else if (percentage >= 50) grades[i][0] = "D";
            else if (percentage >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }

        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.2f%-10s\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], results[i][0], grades[i][0]);
        }
    }
}
