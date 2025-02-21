import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose conversion: 1. Celsius to Fahrenheit 2. Fahrenheit to Celsius");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            double celsius = getInput("Enter temperature in Celsius: ");
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
        } else if (choice == 2) {
            double fahrenheit = getInput("Enter temperature in Fahrenheit: ");
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static double getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextDouble();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
