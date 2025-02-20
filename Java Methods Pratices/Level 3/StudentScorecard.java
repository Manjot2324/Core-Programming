import java.util.Scanner;

public class StudentScorecard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        double[][] marks = generateMarks(numStudents);
        double[][] studentResults = calculateResults(marks);
        displayScorecard(studentResults);
    }

    public static double[][] generateMarks(int numStudents) {
        double[][] marks = new double[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = 40 + Math.random() * 60; 
            marks[i][1] = 40 + Math.random() * 60; 
            marks[i][2] = 40 + Math.random() * 60; 
        }
        return marks;
    }

    public static double[][] calculateResults(double[][] marks) {
        double[][] results = new double[marks.length][5];
        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;
            String grade = calculateGrade(percentage);

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = getGradeNumericValue(grade);
        }
        return results;
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static int getGradeNumericValue(String grade) {
        switch (grade) {
            case "A": return 80;
            case "B": return 70;
            case "C": return 60;
            case "D": return 50;
            case "E": return 40;
            default: return 39;
        }
    }

    public static void displayScorecard(double[][] results) {
        System.out.println("Student\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < results.length; i++) {
            double total = Math.round(results[i][0] * 100.0) / 100.0;
            double average = Math.round(results[i][1] * 100.0) / 100.0;
            double percentage = Math.round(results[i][2] * 100.0) / 100.0;
            String grade = calculateGrade(percentage);
            System.out.printf("%d\t%.2f\t%.2f\t%.2f%%\t\t%s\n", i + 1, total, average, percentage, grade);
        }
    }
}
