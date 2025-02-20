import java.util.Random;

public class RandomNumberStats {
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(9000) + 1000;  
        }
        
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int number : numbers) {
            sum += number;
            if (number < min) min = number;
            if (number > max) max = number;
        }
        
        double average = sum / (double) numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        System.out.println("Generated random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        
        double[] stats = findAverageMinMax(randomNumbers);
        System.out.println("\nAverage: " + stats[0]);
        System.out.println("Min: " + stats[1]);
        System.out.println("Max: " + stats[2]);
    }
}
