import java.util.Scanner;

public class QuadraticEquation {
    public static double[] findRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) return new double[0];  
        
        if (delta == 0) {
            double root = -b / (2.0 * a);
            return new double[] { root };
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            return new double[] { root1, root2 };
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter value of c: ");
        int c = scanner.nextInt();
        
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            for (double root : roots) {
                System.out.println("Root: " + root);
            }
        }
    }
}
