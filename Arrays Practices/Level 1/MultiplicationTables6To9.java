import java.util.Scanner;

public class MultiplicationTables6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] multiplicationResult = new int[40];
        int index = 0;

        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                multiplicationResult[index++] = i * j;
            }
        }

        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println((i / 10 + 6) + " * " + (i % 10 + 1) + " = " + multiplicationResult[i]);
        }

    }
}
