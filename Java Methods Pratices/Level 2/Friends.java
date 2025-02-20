import java.util.Scanner;

public class Friends {
    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int age : ages) {
            if (age < youngest) {
                youngest = age;
            }
        }
        return youngest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] ages = new int[3];
        int[] heights = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();
        }
        
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);
        
        System.out.println("Youngest friend's age: " + youngest);
        System.out.println("Tallest friend's height: " + tallest);
    }
}
