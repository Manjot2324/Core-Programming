import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPeople = 10;
        double[][] personsData = new double[numPeople][2];
        String[][] bmiResults = new String[numPeople][4];

        for (int i = 0; i < numPeople; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            personsData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            personsData[i][1] = sc.nextDouble();
        }

        bmiResults = calculateBMI(personsData);
        displayResults(bmiResults);
    }

    public static String[][] calculateBMI(double[][] data) {
        String[][] bmiStatus = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            bmiStatus[i][0] = String.valueOf(data[i][1]);  
            bmiStatus[i][1] = String.valueOf(data[i][0]);  
            bmiStatus[i][2] = String.format("%.2f", bmi);   

            if (bmi <= 18.4) {
                bmiStatus[i][3] = "Underweight";
            } else if (bmi <= 24.9) {
                bmiStatus[i][3] = "Normal";
            } else if (bmi <= 39.9) {
                bmiStatus[i][3] = "Overweight";
            } else {
                bmiStatus[i][3] = "Obese";
            }
        }
        return bmiStatus;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Person | Height (cm) | Weight (kg) | BMI  | Status");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + " | " + results[i][0] + " | " + results[i][1] + " | " + results[i][2] + " | " + results[i][3]);
        }
    }
}
