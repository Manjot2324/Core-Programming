import java.util.Scanner;

public class AreaofTri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516; 

        System.out.println("Area of the Triangle in square inches: " + areaInches);
        System.out.println("Area of the Triangle in square centimeters: " + areaCm);
    }
}
