import java.util.Scanner;

public class AthleteRounds {
    public static int calculateRounds(int side1, int side2, int side3) {
        int perimeter = side1 + side2 + side3;
        return (5000 / perimeter) + (5000 % perimeter == 0 ? 0 : 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();
        
        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();
        
        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();
        
        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
    }
}
