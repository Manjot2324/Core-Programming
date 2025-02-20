import java.util.Scanner;

public class BMI {
    public static double calculateBMI(double weight, double height) {
        height = height / 100;  
        return weight / (height * height);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal weight";
        if (bmi < 29.9) return "Overweight";
        return "Obesity";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] data = new double[10][3];  
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
            
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            System.out.println("BMI of person " + (i + 1) + ": " + data[i][2] + " (" + getBMIStatus(data[i][2]) + ")");
        }
    }
}
